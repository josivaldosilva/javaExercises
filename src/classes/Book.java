package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Book {

  private String title;
  private Author author;
  private String publisher;
  private String literaryGenre;
  private int ISBN;
  private String releaseDate;
  
  // Lista de autores do livro

  private List<Author> authors = new ArrayList<>();
  private Random random = new Random();

  public Book(){
    
  }

  public Book(String title, List<Author> authors, String publisher, String literaryGenre, String releaseDate) {
    this.title = title;

    // Popula a lista de autores
    for(Author allAuthors : authors){
      this.authors.add(allAuthors);
    }

    this.publisher = publisher;
    this.literaryGenre = literaryGenre;
    this.releaseDate = releaseDate;
    this.ISBN = setISBN();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  // public void setAuthor(Author author) {
  //   this.author = author;
  // }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getLiteraryGenre() {
    return literaryGenre;
  }

  public void setLiteraryGenre(String literaryGenre) {
    this.literaryGenre = literaryGenre;
  }

  public int getISBN() {
    return ISBN;
  }

  private int setISBN() {
    return random.nextInt(1001);
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public List<Author> getAuthors(){
    return authors;
  }

  // Método para exibir detales do livro


  public String showBookDetails(){

    StringBuilder sb = new StringBuilder();

    sb.append("Livro {\n");
    sb.append("   Titulo: " + title + "\n");

    if(authors.size() == 1){
      sb.append("   Autor: \n");
    }else {
      sb.append("   Autores: \n");
    }
    for (Author author : authors) {
      sb.append("       - " + author.getFullName() + "\n"); 
    }

    sb.append("   ISBN: " + ISBN + "\n");
    sb.append("   Genero literario: " + literaryGenre + "\n");
    sb.append("   Data de publicacao: " + releaseDate + "\n");
    sb.append("   Editora: " + publisher + "\n" + "} " + "\n");

    return sb.toString(); 
  }
  
}
