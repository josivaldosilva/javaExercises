import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;

public class PublicPrivateProtectedDefault{

  // Funcções que gera números aleatórios para ID´s dos usuários
  public static int RandomIdGenerator(){
    SecureRandom random = new SecureRandom();
    int randomId = 0 + random.nextInt(1000);
    return randomId; 
  }

  // Procedimento para registar novos usuários
  public static void registUser(){
    Scanner keyboScanner = new Scanner(System.in);
    
    Jogador newJogador = new Jogador();
    
    System.out.print("\nDigite o seu nome: ");
    newJogador.setUserName(keyboScanner.nextLine());

    System.out.print("\nDigite o seu Sobrenome: ");
    newJogador.setUserSurname(keyboScanner.nextLine());
    
    System.out.print("\nDigite os 6 últimos digitos do seu número de telefone: ");
    newJogador.setUserTelNum("923" + keyboScanner.nextLine());

    keyboScanner.close();

    newJogador.setUserId(RandomIdGenerator());

    System.out.printf("\nNome: %s\nSobrenome: %s\nTelefone: %s\nId: %d", newJogador.getUserName(), newJogador.getUserSurname(), newJogador.getUserTelNum(), newJogador.getUserId());
  }

  public static void main(String[] args) {

    registUser();
    
  } 
}