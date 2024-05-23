import javax.swing.*;

public class BorderLayout {

  public static void main(String[] args){
    JFrame frame = new JFrame("Java GUI application");
    
    JLabel labelNorth = new JLabel("North");
    labelNorth.setHorizontalAlignment(JLabel.NORTH);
    
    JLabel labelSouth = new JLabel("South");
    labelSouth.setHorizontalAlignment(JLabel.SOUTH);
    
    JLabel labelWest = new JLabel("West");
    JLabel labelEast = new JLabel("East");
    JLabel labelCenter = new JLabel("Center");
    labelCenter.setHorizontalAlignment(JLabel.CENTER);

    frame.add(labelNorth,BorderLayout.NORTH);
    frame.add(labelSouth,BorderLayout.SOUTH);
    frame.add(labelWest,BorderLayout.WEST);
    frame.add(labelEast,BorderLayout.EAST);
    frame.add(labelCenter,BorderLayout.CENTER);

    frame.setSize(500, 800);
    frame.setVisible(true);
    
  }
}