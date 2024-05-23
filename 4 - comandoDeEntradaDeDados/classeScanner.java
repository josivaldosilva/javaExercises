import java.util.Scanner;

public class classeScanner{

    public static void main(String[] args){
        Scanner gFK = new Scanner(System.in);

        int n1 = 0, n2 = 0, acpMedia = 10;
        double media = 0.0;
        String result;


        System.out.print("Digite a primeira nota: ");
        n1 = gFK.nextInt();

        System.out.print("Digite a segunda nota: ");
        n2 = gFK.nextInt();

        media = (n1 + n2) / 2 ;

        result = media >= acpMedia ? "Parabéns! foste aprovado" : "Tenta na próxima";

        System.out.print(result);


        //next - recebe String sem quebra de linha
        //nextLine - recebe String com quebra de linha

        // String name;

        // System.out.print("Digite o seu nome: ");
        // name = gFK.next();
        // System.out.printf("Olá! %s como vai?", name);



        // nextInt - Receba número inteiro

        // int n1 = 0, n2 = 0, res = 0;


        // System.out.print("Digite um numeral: ");
        // n1 = gFK.nextInt();
        
        // System.out.print("Digite outro numeral: ");
        // n2 = gFK.nextInt();

        // res = n1 + n2;

        // System.out.printf("A soma de %d com %d e igual a %d", n1 ,n2, res);

        
    }

}