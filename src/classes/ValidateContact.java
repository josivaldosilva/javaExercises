package classes;

import java.util.Scanner;

public class ValidateContact {
  
  private Scanner keyboard = new Scanner(System.in);

  public int getValidContact() {

    int contact;

    while (true) {
      
      try {
        System.out.print("Contato (9XXXXXXXX): ");
        contact = keyboard.nextInt();

        // Validação do contato
        // Verifica se contacto tem 9 digitos e comeca com nove
        
        if (String.valueOf(contact).trim().matches("9\\d{8}")) {
            return contact; // Retorna o contato válido
        } else {
            System.out.println("Contato inválido! Certifique-se de que tem 9 dígitos e começa com 9.");
        }
      } catch (Exception e) {
          System.out.println("Entrada inválida! Digite apenas números.");
          keyboard.next(); // Limpa a entrada inválida para continuar
      }
    }
  }
}
