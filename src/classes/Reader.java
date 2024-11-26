package classes;

public class Reader {

  private String fullName;
  private String address;
  private int contact;

  // Lista de livros emprestados 

  public Reader(){

  }
  
  public Reader(String fullName, String address, int contact) {
    this.fullName = fullName;
    this.address = address;
    this.contact = contact;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getContact() {
    return contact;
  }

  public void setContact(int contact) {
    this.contact = contact;
  }

  public String showReaderDetails(){
    StringBuilder sb = new StringBuilder();
    sb.append("  Nome completo: " + fullName + "\n");
    sb.append("  Morada: " + address + "\n");
    sb.append("  Contacto: " + contact + "\n");
    return sb.toString();
  }
}
