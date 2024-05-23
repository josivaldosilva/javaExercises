package modularizacao;

public class procedimento {
  public static void menuString(int items ){
        
    System.out.println("-------------- This is a examples of how a  menu seems----------------");

    for(int i = 0; i < items; i++)
    System.out.printf("%dº - Item.\n", i+1);
  }
  public static void main(String[] args) {
    menuString(5);
  }
}
