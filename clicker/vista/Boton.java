package clicker.vista;

import javax.swing.*;

import clicker.controlador.Contador;

public class Boton {
    public void Clicker(){   
        JFrame frame = new JFrame("CLICKER"); // Create a new JFrame container
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(600, 600);

        Contador contador = new Contador(frame);

        contador.incrementarContador();

        frame.setVisible(true);
    }
}
