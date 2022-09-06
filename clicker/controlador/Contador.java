package clicker.controlador;

import javax.swing.*;


public class Contador {

    private int contador = 0;
    private JFrame frame;
  
    public Contador(JFrame frame) {
      this.frame  = frame;
    }
  
      public void incrementarContador() {
          JPanel panel = new JPanel();
          JButton button = new JButton("Click me!"); 
          JLabel label = new JLabel("Clicks: " + contador); 
          panel.add(button);
          panel.add(label);
          frame.add(panel);
  
        button.addActionListener(action -> {
          contador++;
          label.setText("Clicks: " + contador);
        });
      }
}