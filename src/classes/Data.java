package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Data {
  
  Scanner scanner = new Scanner(System.in);
  
  public String getValidatedDate() {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o formato padrão
    LocalDate currentDate = LocalDate.now();// Pega a data atual

    while (true) {
      
      System.out.print("Data de publicacao (dd/MM/yyyy): ");
      try {
        String inputDate = scanner.nextLine();

        // Tenta formatar a data inserida
        LocalDate parsedDate = LocalDate.parse(inputDate, formatter);

        // Verifica se a data não é maior que a data atual
        if (parsedDate.isAfter(currentDate)) {
          System.out.println("A data não pode ser maior que a data atual. Tente novamente.");
        } else {
          // Retorna a data formatada corretamente
          return parsedDate.format(formatter);
        }
      }catch (DateTimeParseException e) {
        System.out.println("Formato inválido! Certifique-se de usar o formato (dd/MM/yyyy.)\n");
      }
    }
  }
  
  public void TimeCalculator(){

  // Solicita ao usuário o número de dias de empréstimo
    int days = 0;
    final int Max_time = 30;
    
    while (true) {

      try {
          System.out.print("\nPretende fica com o livro por quantos dias (1 a 30): ");
          days = scanner.nextInt();

          if (days >= 1 && days <= Max_time) {
              break;
          } else {
              System.out.println("\nO prazo limite de emprestimo sao de 30 dias\n.");
          }
      } catch (Exception e) {
          System.out.println("\nEntrada invalida. Por favor digite apenas numeros de 0 a 30\n");
          scanner.next(); // Limpa a entrada inválida
      }
    }
    
    // Calcula as datas
    LocalDateTime currentDate = LocalDateTime.now();
    LocalDateTime returnDate = currentDate.plusDays(days);
    
    // Formata as datas para exibição
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    // Exibe os resultados
    System.out.println("\nData do emprestimo: " + currentDate.format(formatter));
    System.out.println("Data da deovulacao: " + returnDate.format(formatter));
  }
}
