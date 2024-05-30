import java.util.Vector;
import java.util.Scanner;

public class AccountTest {
  private static Vector<Account> allAccounts = new Vector<>(50);

  public static void CreateAccount(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n\t----- Criar Conta -----\t");
    System.out.print("\nNome completo: ");
    String name = scanner.nextLine();

    String account_num = "";
    if(allAccounts.size() < 10){
      account_num = "00".concat((allAccounts.size() + 1) + "");
    }else{
      if(allAccounts.size() >= 10){
        account_num = "0".concat((allAccounts.size() + 1) + "");
      }
    }

    Account account = new Account(name, account_num);
    allAccounts.add(account);
  }

  public static void ConsultingAccount(){
    System.out.println("\n\t----- Consultar Conta -----\t");
    Scanner scanner = new Scanner(System.in);

    if(allAccounts.isEmpty()){
      System.out.println("\nNão há contas registadas ainda, crie uma conta");
    }else {

      String num;

      // Verifica se o número digitado tem 3 digitos ou não, se não tiver vai repetir esse bloco
      do{
        System.out.print("\nNumero da conta: ");
        num = scanner.next();
        
        if(num.length() != 3){
          System.out.println("\nO numero da conta de conter apenas 3 digitos.");
        }else {
          break;
        }
      }while(true);

      for(Account account : allAccounts){
      
        if (account.account_num.equals(num)) {
          System.out.println("\nConta Nº: " + account.account_num);
          System.out.println("Proprietario: " + account.owner_name);
          System.out.println("Saldo na Conta: " + account.balance);
        }else {
          //Caso a conta não existe no sistema
          System.out.println("\nConta não existe");
        }
      }
    }
  }

  public static void ListAccounts(){
    System.out.println("\n\t----- Contas -----\t");

    if(allAccounts.isEmpty()){
      System.out.println("\nNão há contas registadas ainda, crie uma conta\n");
    }else {
      
      for(Account account : allAccounts){     
        System.out.println("\nConta Nº: " + account.account_num);
        System.out.println("Proprietario: " + account.owner_name);
        System.out.println("Saldo na Conta: " + account.balance);
        System.out.println("\n------------------------------------\n");           
      }
    }
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opt;

    do{

      System.out.println("\n1 - Criar Conta");
      System.out.println("2 - Consultar Conta");
      System.out.println("3 - Listar Contas");
      System.out.println("4 - Sair\n");

      opt = scanner.nextInt();

      switch (opt) {
        case 1:
          CreateAccount();
          break;
        case 2:
          ConsultingAccount();
          break;
        case 3:
          ListAccounts();
          break;
        case 4:
          break;
        default:
          System.out.println("Opcao não existe");
          break;
      }
    }while(opt != 4);
  }
}
