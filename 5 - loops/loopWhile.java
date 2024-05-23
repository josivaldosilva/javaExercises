import java.util.Scanner;

public class loopWhile{

    public static void main(String[] args){
        
        int i = 1, num, res;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        while(i <= 12){
            res = num * i;
            System.out.printf("%d X %d = %d\n", num, i, res);
            i++;
        };
    };

}