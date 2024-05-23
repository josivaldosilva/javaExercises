import java.util.Scanner;

public class vector {
  public static void main(String[] args) {
    Scanner names = new Scanner(System.in);

    String[] userName= new String[5];

    for(int i = 0; i < userName.length; i++){
      System.out.println("Digite nome: ");
      userName[i] = names.nextLine();    
    }

    System.out.println("List de usúarios:");

    for(int i = 0; i < userName.length; i++){
      System.out.println(i+1 + "º - " + userName[i]);
    }

  }
}
