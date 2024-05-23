import java.util.Scanner;

public class matriz {
  public static void main(String[] args) {
    Scanner keybo = new Scanner(System.in);    

    int[][] num = new int[2][2];

    for(int row = 0; row < num.length; row++){
      for(int column = 0; column < num[row].length; column++ ){
        System.out.print("Digite o  número: ");
        num[row][column] = keybo.nextInt();
      }
    }
    
    keybo.close();

    for(int row = 0; row < num.length; row++){
      for(int column = 0; column < num[row].length; column++ ){
        System.out.print(num[row][column] + " ");
      }
    }
  }
}
