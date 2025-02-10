package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class VehiculoTransporte extends Vehiculo{
    private int maximoPasajeros;
    private LinkedList<Usuario> usuarios;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis,
            int maximoPasajeros) {
        super(placa, modelo, marca, color, numeroChasis);
        this.maximoPasajeros = maximoPasajeros;
        this.usuarios = new LinkedList<>();
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public String toString() {
        return "\n\nVehiculoTransporte ["+ super.toString() + ", maximoPasajeros=" + maximoPasajeros + ", Usuarios= " + usuarios + "]";
    }
    
}
