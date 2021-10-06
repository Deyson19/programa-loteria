package classLibrary;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Loteria {

    int id, numero;
    String name;
    Persona p1;

    public void guardarNumeroLo() {
        name = (JOptionPane.showInputDialog("Por favor ingresa tu nombre: ")).toUpperCase();
        //String nameMayus = name.toLowerCase();
        p1 = new Persona(name);
        p1.crearBoleto();
        p1.mostrarDatos();
        numero = p1.getNumero();
        JOptionPane.showMessageDialog(null, "Tu número asignado es: " + numero +" y ya estas participando en la lotería",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Numero ingresado es: "+numero);
    }

}
