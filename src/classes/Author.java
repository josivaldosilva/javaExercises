package classes;

import java.util.ArrayList;
import java.util.List;

public class Author {
 
  private String nationality;
  private String fullName;
  private String address;

  public Author(){
    
  }

  public Author(String nationality, String address, String fullName) {

    this.nationality = nationality;
    this.address = address;
    this.fullName = fullName;
  }

  private List<Book> book_their_owner = new ArrayList<>();


  public void setFullName(String fullName){
    this.fullName = fullName;
  }

  public String getFullName(){
    return fullName;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List<Book> getBook_owner() {
    return book_their_owner;
  }

  public void setBook_owner(List<Book> book_their_owner) {
    this.book_their_owner = book_their_owner;
  }

  public void getAuthorInfo(){
    System.out.println("Nome completo: " + fullName);
    System.out.println("Nacionalidade: " + nationality);
    System.out.println("Morada: " + address);
  }
}
