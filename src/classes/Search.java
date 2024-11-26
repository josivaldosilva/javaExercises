package classes;

import java.util.List;

public class Search {
  
  private final String defaultMessage = "\nHouve um erro enquanto consultava o livro ";
  
  // Consulta pelo title e pelo genero liteario
  
  public String byKeyword(List<Book> books, String keyword){ 
    
    try {
      for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(keyword) || book.getLiteraryGenre().equalsIgnoreCase(keyword)) {
          return book.showBookDetails();
        }else {
          return null;
        }
      }
    } catch (Exception e) {
      System.err.println(defaultMessage + e.getMessage() + "\n");
    }
    return null;
  }
  
  // Pesquisar pelos nomes dos autor(es)

  public String byAuthorName(List<Book> books, String authorName){ 
    
    try {
      
      //O 1º loop percorre a lista de objectos livro, pega 
      
      for (Book book : books) {
        
        //O 2º loop percorre pega  cada objecto livro e percorre a lista de autores 

        for(Author author : book.getAuthors()){

          if(author.getFullName().equalsIgnoreCase(authorName)){
            return book.showBookDetails();
          }else {
            return null;
          }
        }
      }
    } catch (Exception e) {
      System.err.println(defaultMessage + e.getMessage() + "\n");
    }
    return null;
  }
  
  // Consultar pelo ISBN
  
  public String byISBN(List<Book> books, int ISBN){ 
    
    try {
      for (Book book : books) {
        if (book.getISBN() == (ISBN)) {
          return book.showBookDetails();
        }else {
          return null;
        }
      }
    } catch (Exception e) {
      System.err.println(defaultMessage + e.getMessage() + "\n");
    }
    return null;
  }
  
}