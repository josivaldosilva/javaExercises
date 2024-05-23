import javax.swing.*;

public class JLabelApplication {

  public static void main(String[] args) {
    JFrame tela = new JFrame("Tela java");

    JLabel titulo = new JLabel("Meu titulo");

    tela.add(titulo);
    tela.setSize(300, 200);
    tela.setVisible(true);
  }
}