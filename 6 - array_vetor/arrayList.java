import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    Scanner keyboScan = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int num;

    while(true){
      System.out.print("\nDigite um número: ");
      num = keyboScan.nextInt();

      if(num < 0){
        break;
      }else {
        numbers.add(num);
      }
    }

    for(Integer number : numbers){
      System.out.println("\n" + number);
    }
  }
}
