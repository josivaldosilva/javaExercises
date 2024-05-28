package capviiiexercises;

public class Aluno {
  String nome;
  int idade;
  int numeroEstudante;

  public Aluno(String nome, int idade, int numeroEstudante) {
      this.nome = nome;
      this.idade = idade;
      this.numeroEstudante = numeroEstudante;
  }

  public int tamanho() {
      return nome.length();
  }

  public void imprimirDados() {
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Número do estudante: " + numeroEstudante);
  }
}