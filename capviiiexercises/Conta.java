package capviiiexercises;

public class Conta {
  int numero;
  String nomeDono;
  double saldo;

  public Conta(int numero, String nomeDono, double saldo) {
      this.numero = numero;
      this.nomeDono = nomeDono;
      this.saldo = saldo;
  }

  public void levantamento(double valor) {
      if (valor > 0 && valor <= saldo) {
          saldo -= valor;
          System.out.println("Levantamento realizado com sucesso.");
      } else {
          System.out.println("Valor de levantamento inválido.");
      }
  }

  public void depositar(double valor) {
      if (valor > 0) {
          saldo += valor;
          System.out.println("Depósito realizado com sucesso.");
      } else {
          System.out.println("Valor de depósito inválido.");
      }
  }

  public void imprimirDados() {
      System.out.println("Número da conta: " + numero);
      System.out.println("Nome do dono: " + nomeDono);
      System.out.println("Saldo: " + saldo);
  }
}