package classLibrary;

import javax.swing.JOptionPane;

public class Persona {

    private int numero;
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void crearBoleto() {
        try {
            numero = (int) (Math.random() * 10000)+1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo generar tu número"+e);
        }
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Hola, tu nombre es: " + nombre);
        //JOptionPane.showMessageDialog(null, "Tu número ha sido generado correctamente, y es el: " + numero);
    }

}
