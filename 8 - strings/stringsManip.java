import java.util.Scanner;

public class stringsManip {
  public static void main(String[] args) {
    
    Scanner keybScanner = new Scanner(System.in);
    
    String myStr = new String();
    String newStr = new String();

    System.out.println("\nDigite uma frase: ");
    myStr = keybScanner.nextLine();

    for(int i = myStr.length() - 1; i >= 0; i--){
      newStr += myStr.charAt(i);
    }

    keybScanner.close();

    if(myStr.equalsIgnoreCase(newStr)){
      System.out.println("\nÉ capicua");
    }else {
      System.out.println("\nNão é capicua");
    }
  }  
}
