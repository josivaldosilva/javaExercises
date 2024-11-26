package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_Library {

  private Scanner keyboardScanner = new Scanner(System.in);
  private List<Book> books = new ArrayList<>();
  private String releaseDateString;
  private Cleaner cleaner = new Cleaner();
  private static final String defaultMessage = "\nOops, parece que voce digitou uma opcao nao existente.\n";

  private List<Reader> readers = new ArrayList<>();

  // Método de registrar livro

  public void bookRegister(){

    cleaner.cls();

    System.out.println("\nRegistrar livro\n");
    System.out.print("Titulo: ");
    String title = keyboardScanner.nextLine();

    int numberOfAuthors = 0;

    while (numberOfAuthors <= 0) {

      System.out.print("Digite o número de autores do livro: ");

      if (keyboardScanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
        numberOfAuthors = keyboardScanner.nextInt();

        if (numberOfAuthors <= 0) {
          System.out.println("O livro não pode ficar sem autores. Tente novamente.\n");
        }
      } else {
        System.out.println("Por favor, insira um número válido.");
        keyboardScanner.next(); // Limpa a entrada inválida
      }
    }

    keyboardScanner.nextLine(); // Consumir a proxima linha

    List<Author> authors = new ArrayList<>();

    // Limpar o console

    cleaner.cls();

    for(int i = 0; i < numberOfAuthors; i++){

      System.out.println("\n     --- Autor " + (i + 1) + " ---");

      System.out.print(" Nome completo: ");
      String fullName = keyboardScanner.nextLine();

      System.out.print(" Nacionalidade: ");
      String nationality = keyboardScanner.nextLine();

      System.out.print(" Morada: ");
      String address = keyboardScanner.nextLine();

      System.out.println("\n");
      authors.add(new Author(nationality, address, fullName));

      cleaner.cls();
    }

    System.out.print("Genero literario: ");
    String lGenre = keyboardScanner.nextLine();

    final Data data = new Data();
    
    releaseDateString = data.getValidatedDate();

    System.out.print("Editora: ");
    String publisher = keyboardScanner.nextLine();

    Book newBook = new Book(title, authors, publisher, lGenre, releaseDateString);
    books.add(newBook);
    System.out.println("\nLivro registrado com sucesso \n");

    timerSimulator();
    cleaner.cls();

  }

  // mensagem padrao

  final String message = "\nLamentamos mas nao conseguimos encontrar o livro, tente novamente\n";
  final String message2 ="\nLamentamos, mas nao temos livros disponiveis no momento, por favor tente mais tarde\n";
  
  // Método para consultar livross

  public void searchBook(){
    cleaner.cls();
    System.out.println("Consultar livro\n");
    
    int option;

    do {
      
      System.out.println("1 - Pelo titulo\n2 - Pelo nome do autor\n3 - Pelo genero literario\n4 - Pelo ISBN\n5 - Voltar\n");

      option = keyboardScanner.nextInt();
      keyboardScanner.nextLine(); // limpa o buffer

      String returned;
      Search search = new Search();

      switch (option) {
        case 1:

          cleaner.cls();

          System.out.print("Digite o titulo: ");
          String title = keyboardScanner.nextLine();

          returned = search.byKeyword(books, title);

          if (returned != null) {
            System.out.println("\n" + returned);
          }else {
            System.out.println(message);
          }

          break;

        case 2:

          cleaner.cls();

          System.out.print("Digite o nome do autor: ");
          String authorName = keyboardScanner.nextLine();

          returned = search.byAuthorName(books, authorName);

          if (returned != null) {
            System.out.println("\n" + returned);
          }else {
            System.out.println(message);
          }

          break;
          
        case 3:

          cleaner.cls();

          System.out.print("Digite o genero literario: ");
          String literaryGenre = keyboardScanner.nextLine();

          returned = search.byKeyword(books, literaryGenre);

          if (returned != null) {
            System.out.println("\n" + returned);
          }else {
            System.out.println(message);
          }

          break;

        case 4:

          cleaner.cls();

          System.out.print("Digite o ISBN: ");
          int ISBN = keyboardScanner.nextInt();

          returned = search.byISBN(books, ISBN);

          if (returned != null) {
            System.out.println("\n" + returned);
          }else {
            System.out.println(message);
          }

          break;
        case 5:
          cleaner.cls();
          break;

        default:
          System.out.println(defaultMessage);
          break;
      }

    } while (option != 5);

  }

  // Método para emprestar livro

  public void lendBook(){

    System.out.println("\nPreencha os campos abaixo: \n");

    System.out.print("Nome completo: ");
    String fullName = keyboardScanner.nextLine();
    
    System.out.print("Morada: ");
    String address = keyboardScanner.nextLine();

    ValidateContact vContact = new ValidateContact();

    // Regista novo leitor baseado na validacao do contacto e adiciona na list de leitores

    try {
      Reader reader = new Reader(fullName, address, vContact.getValidContact());
      readers.add(reader);
      System.out.println("\nLeitor registado com sucesso");

    } catch (Exception e) {
      System.out.println("\nErro inesperado: " + e.getMessage() + "\n");
    }

    // Simula uma demora
    timerSimulator();
    cleaner.cls();

    // Verifica se a lista de livro esta vazia e executar o codigo caso atenda as condicoes

    if(!books.isEmpty()){

      // 1º limpa a tela
      cleaner.cls();

      System.out.println("\nComo deseja encontrar o livro? ");
      int choose;

      do {

        System.out.println("\n1 - Titulo\n2 - Nome do(a) autor(a)\n3 - Genero literario\n4 - ISBN\n5 - Voltar\n");

        String returned; 

        choose = keyboardScanner.nextInt();
        keyboardScanner.nextLine(); // Limpa o buffer de entrada
        
        Search search = new Search();
        Data data = new Data();

        switch (choose) {

          case 1:

            cleaner.cls();

            System.out.print("Digite o titulo: ");
            final String titleString = keyboardScanner.nextLine();

            returned = search.byKeyword(books, titleString);
            
            if(returned != null){

              System.out.println("\n" + returned);

              try {  
                
                String otherChoose;
                
                System.out.print("Deseja continuar (S/N): ");
                otherChoose = keyboardScanner.next();

              // Verifica se opcao escolhida e um s e remove o livro da lista

              if(otherChoose.equalsIgnoreCase("s")){

                for (Book book : books) {

                  data.TimeCalculator();

                  if(book.getTitle().equalsIgnoreCase(titleString)){
                    books.remove(book);

                    System.out.println("\nLivro emprestado com sucesso\n\nDetalhes do emprestimo:\n");
                    System.out.println("Leitor: ");

                    for(Reader reader : readers){
                      if (reader.getFullName().equalsIgnoreCase(fullName) && reader.getContact() == vContact.getValidContact()) {
                        System.out.println(reader.showReaderDetails());
                        break;
                      }
                    }

                    System.out.println(book.showBookDetails());

                    break;
                  }
                }break;

              }else {
                System.out.println("\nCancelando...\n");
                timerSimulator();
                cleaner.cls();
              }    
              
              } catch (Exception e) {
                System.out.println("\nOcooreu um erro ao emprestar o livro \n");
                System.err.println("Erro: " + e.getMessage());
              }
            }else{
              System.out.println(message);
            }
            break;

          case 2:

            cleaner.cls();

            System.out.print("Digite o nome do author: ");
            final String authorName = keyboardScanner.nextLine();

            returned = search.byAuthorName(books, authorName);
            
            if(returned != null){

              System.out.println("\n" + returned);

              try {  
                
                String otherChoose;
                
                System.out.print("Deseja continuar (S/N): ");
                otherChoose = keyboardScanner.next();

              // Verifica se opcao escolhida e um s e remove o livro da lista

                if(otherChoose.equalsIgnoreCase("s")){

                  for (Book book : books) {

                    data.TimeCalculator();

                    for (Author author : book.getAuthors()) {
                      
                      if(author.getFullName().equalsIgnoreCase(authorName)){
                        books.remove(book);

                        
                        System.out.println("\nLivro emprestado com sucesso\nDetalhes do emprestimo:");
                        System.out.println("Leitor: ");
                        
                        for(Reader reader : readers){
                          if (reader.getFullName().equalsIgnoreCase(fullName) && reader.getContact() == vContact.getValidContact()) {
                            System.out.println(reader.showReaderDetails());
                          }
                        }
                        System.out.println(book.showBookDetails());
                      }
                      
                      break;
                    }
                  
                  }break;

                }else {
                  System.out.println("\nCancelando...\n");
                  timerSimulator();
                  cleaner.cls();
                }    
              } catch (Exception e) {
                System.out.println("\nOcooreu um erro ao emprestar o livro \n");
                System.err.println("Erro: " + e.getMessage());
              }
            }else{
              System.out.println(message);
            }

            break;

          case 3:

            cleaner.cls();

            System.out.print("Digite o titulo: ");
            final String literarryGenre = keyboardScanner.nextLine();

            returned = search.byKeyword(books, literarryGenre);
            
            if(returned != null){

              System.out.println("\n" + returned);

              try {  
                
                String otherChoose;
                
                System.out.print("Deseja continuar (S/N): ");
                otherChoose = keyboardScanner.next();

              // Verifica se opcao escolhida e um s e remove o livro da lista

                if(otherChoose.equalsIgnoreCase("s")){
                  for (Book book : books) {
                    data.TimeCalculator();

                    if(book.getLiteraryGenre().equalsIgnoreCase(literarryGenre)){
                      books.remove(book);

                      System.out.println("\nLivro emprestado com sucesso\nDetalhes do emprestimo:");
                      System.out.println("Leitor: ");

                      for(Reader reader : readers){
                        if (reader.getFullName().equalsIgnoreCase(fullName) && reader.getContact() == vContact.getValidContact()) {
                          System.out.println(reader.showReaderDetails());
                          break;
                        }
                      }

                      System.out.println(book.showBookDetails());

                      break;
                    }
                  }break;
                }else {
                  System.out.println("\nCancelando...\n");
                  timerSimulator();
                  cleaner.cls();
                }    
              } catch (Exception e) {
                System.out.println("\nOcooreu um erro ao emprestar o livro \n");
                System.err.println("Erro: " + e.getMessage());
              }

            }else{
              System.out.println(message);
            }

            break;

          case 4:

            cleaner.cls();

            System.out.print("Digite o ISBN: ");
            final int ISBN = keyboardScanner.nextInt();

            returned = search.byISBN(books, ISBN);
            
            if(returned != null){

              System.out.println("\n" + returned);

              try {  
                
                String otherChoose;
                
                System.out.print("Deseja continuar (S/N): ");
                otherChoose = keyboardScanner.next();

              // Verifica se opcao escolhida e um s e remove o livro da lista

                if(otherChoose.equalsIgnoreCase("s")){
                  for (Book book : books) {
                    data.TimeCalculator();

                    if(book.getISBN() == ISBN){
                      books.remove(book);

                      System.out.println("\nLivro emprestado com sucesso\nDetalhes do emprestimo:");
                      System.out.println("Leitor: ");

                      for(Reader reader : readers){
                        if (reader.getFullName().equalsIgnoreCase(fullName) && reader.getContact() == vContact.getValidContact()) {
                          System.out.println(reader.showReaderDetails());
                          break;
                        }
                      }

                      System.out.println(book.showBookDetails());

                      break;
                    }
                  }break;
                }else {
                  System.out.println("\nCancelando...\n");
                  timerSimulator();
                  cleaner.cls();
                }    
              } catch (Exception e) {
                System.out.println("\nOcooreu um erro ao emprestar o livro \n");
                System.err.println("Erro: " + e.getMessage());
              }

            }else{
              System.out.println(message);
            }

            break;

          case 5:
            cleaner.cls();
            break;
          default:
            System.out.println(defaultMessage);
          break;
        }

      } while (choose != 4);

    }else {
       System.out.println("\nLamentamos, mas no momento nao temos livros disponiveis. Por favor tente mais tarde\n");
     }
  }

  // Método para simular um timer
  public void timerSimulator(){
    for (double i = 0; i < 9999999.99999; i++) {
      System.out.print("");
    }
  }

  public String listBooks(){
    try {
      if(!books.isEmpty()){
        for (Book book : books) {
          return book.showBookDetails();
        }
      }else {
        return "\nSem livros registrado...\n";
      }
    } catch (Exception e) {
      System.out.println("\nSomething went wrong " + e.getMessage() + "\n");
    }
    return null;
  }
}
