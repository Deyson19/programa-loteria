package classLibrary;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Loteria {

    int id, numero, numeroGanador;
    String name;
    Persona p1;

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public int getNumeroGanador() {
        return numeroGanador = (int) (Math.random() * 10000) + 1;
        //Igualo el valor para que me salga un ganador directo
        //return numeroGanador = p1.getNumero();
    }

    public void guardarNumeroLo() {
        try {
            name = (JOptionPane.showInputDialog("Por favor ingresa tu nombre: ")).toUpperCase();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puedes participar sin un nombre válido");
                name = (JOptionPane.showInputDialog("Por favor ingresa tu nombre: ")).toUpperCase();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No puedes participar en el sorteo");
                    System.exit(0);
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar tu nombre" + e);
        }
        p1 = new Persona(name);
        p1.crearBoleto();
        p1.mostrarDatos();
        numero = p1.getNumero();
        JOptionPane.showMessageDialog(null, "Tu número asignado es: " + numero + " y ya estas participando en la lotería.",
                "Mensaje de Información", JOptionPane.INFORMATION_MESSAGE);

        if (numero == getNumeroGanador()) {
            JOptionPane.showMessageDialog(null, "Felicidades " + name + ", el número ganador es " + getNumeroGanador() + " y eres el ganador.");
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, el número ganador es: " + getNumeroGanador(),
                    "Mensaje de Información", JOptionPane.ERROR_MESSAGE);
        }
    }

}
