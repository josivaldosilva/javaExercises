package classes;

import java.util.Scanner;

public class Menu {

  private static Scanner keyScanner = new Scanner(System.in);
  private static E_Library lManagement = new E_Library();
  private static Cleaner cleaner = new Cleaner();

  private static final String defaultMessage = "\nOops, parece que voce digitou uma opcao nao existente.\n";
  
  public void menu(){
    
    int opt;

    do {

     // cleaner.cls();

      System.out.println("\nSeja Bem-Vindo/a\n\n1 - Registrar novo livro\n2 - Consultar livro\n3 - Listar livros\n4 - Emprestar livro\n0 - Sair\n");

      opt = keyScanner.nextInt();

      switch (opt) {
        case 0:
          System.out.println("\nSaindo...");

          // Simula uma demora ao sair
          lManagement.timerSimulator();
          
          cleaner.cls();
          break;
        case 1: 
          // Registrar livro novo
          lManagement.bookRegister();;
          break;
        case 2: 
          // Consultar livro
          lManagement.searchBook();
          break;
        case 3: 
          // Listar todos os livros
          String returned = lManagement.listBooks();
          if(returned != null){
            System.out.println(lManagement.listBooks());
          }else {
            System.out.println("\nSem livros registrado...\n");
          }
          break;
        case 4: 
          // Empresttar livro
          lManagement.lendBook();
          break;
        case 5:
          break;
        default:
          System.out.println(defaultMessage);
          break;
      }

    } while (opt != 0);
  }

}
