package co.edu.uniquindio.poo;

public class Usuario extends Persona{
    private double peso;

    public Usuario(String nombre, String edad, double peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Usuario ["+ super.toString() + ", peso=" + peso + "]\n";
    }

    
}
