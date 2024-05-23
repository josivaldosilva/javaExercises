package modularizacao;

import java.util.Scanner;

public class Funcoesjava {
  // Funções são declarada/criadas antesdo metódo main, ou seja, nesse espaço
  public static int factorial(int num){
    
    int fact = 1;
    
    if(num == 0){
      return 1;
    }
    else{
      for(int i = 1; i <= num; i++)
        fact *= i;
    }
    return fact;
  }

  public static void main(String[] args){
    Scanner kb =  new Scanner(System.in);
    
    int num;
    int fact;
    
    System.out.print("\nDigite um para saber o seu factorial: ");
    num = kb.nextInt();

    kb.close();

    fact = factorial(num);

    System.out.printf("\nO factorial de %d é: %d", num, fact);
  }
}
