public class Jogador {

  private String name;
  private String surname;
  private String telNum;
  private int userId;

  public Jogador(/*String name, String surName, String telNum, int n*/){
    this.name = "";
    this.surname = "";
    this.telNum = "";    
    this.userId = 0;
  }
  
  // Métodos para definir dados do usuários

  public void setUserName(String name){
      this.name = name;
  }
  public void setUserSurname(String surname){
      this.surname = surname;
  }
  public void setUserTelNum(String telNum){
      this.telNum = telNum;
  }
  public void setUserId(int randomUserId){
      this.userId = randomUserId;
  }

  //Métodos para obter os daddos do usuários
  public String getUserName(){
    return this.name;
  }
  public String getUserSurname(){
    return this.surname;
  }
  public String getUserTelNum(){
    return this.telNum;
  }

  public int getUserId(){
    return this.userId;
  }
}