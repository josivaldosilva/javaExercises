import javax.swing.*;

public class firstGUIApplication {
 public static void main(String[] args){

  JFrame tela = new JFrame("Java GUI Application");
  tela.setSize(300, 200);
  tela.setVisible(true);

  JLabel label = new JLabel("Testando JLabel");
  
  tela.add(label);

 }
}
