import java.util.Scanner;

public class loopFor{

    public static void main(String[] args){
        
        Scanner gettingDataFromKeyboard = new Scanner(System.in);
        
        int num, result;

        System.out.print("Digite um número inteiro: ");
        num = gettingDataFromKeyboard.nextInt();

        for(int i = 0; i <= 12; i++){
            result = num * i; 
            System.out.println(num + " x " + i + " = " + result);
        };
    };
}