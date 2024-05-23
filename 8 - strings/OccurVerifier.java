import java.util.Scanner;


public class OccurVerifier {
  
  public static void main(String[] args) {
    Scanner keyboScanner = new Scanner(System.in);

    String f_str = new String(); 
    String s_str = new String(); 
  
    int count = 0;
    
    System.out.println("\nDigite a primeira frase: ");
    f_str = keyboScanner.nextLine();

    System.out.println("\nDigite a segunda frase: ");
    s_str = keyboScanner.nextLine();

    for(int i = 0; i <= f_str.trim().length() - 1; i++){
      char letter = f_str.charAt(i);

      for(int j = 0; j <= s_str.trim().length() - 1; j++){
        if(s_str.charAt(j) == letter ) {
          count++;
        }
      }
    }
     
    keyboScanner.close();

    System.out.printf("\nForam repetidas %d vezes: ", count);

  }
}
