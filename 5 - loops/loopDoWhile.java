import java.util.Scanner;

public class loopDoWhile{
    public static void main(String[] args){
        int count = 0, num, res;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = scan.nextInt();

        scan.close();
        
        do{
            res = num * count;
            System.out.printf("%d X %d = %d\n", num, count, res);
            count++;
        }while(count <= 12);
    }
}