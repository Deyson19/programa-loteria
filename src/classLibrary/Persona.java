package classLibrary;

import javax.swing.JOptionPane;

public class Persona {

    private int id, numero;
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
        numero = (int) (Math.random() * 10000);
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Hola, tu nombre es: " + nombre);
        JOptionPane.showMessageDialog(null, "Tu número ha sido generado correctamente, y es el: " + numero);

        //System.out.println("Tu nombre es: "+nombre);
        //System.out.println("Tu número es: "+numero);
    }

}
