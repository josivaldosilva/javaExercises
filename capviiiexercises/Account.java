public class Account {
  String account_num;
  double balance;
  String owner_name;

  public Account(String ownerName, String account_num){
    this.owner_name = ownerName;
    this.account_num = account_num;
    this.balance = 0.0;
  }

  public void withdrawing(double value){
    this.balance-=value;
  }

  public void depositing(double value){
    this.balance+=value;
  }

  public void printAccountInfo(){
    System.out.println("Conta Nº: " + account_num);
    System.out.println("Proprietario: " + owner_name);
    System.out.println("Saldo na conta: " + balance);
  }
}
