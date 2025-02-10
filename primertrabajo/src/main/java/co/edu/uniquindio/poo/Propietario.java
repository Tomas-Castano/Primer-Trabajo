package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Propietario extends Persona{
    private String cedula;
    private String email;
    private String celular;
    public Vehiculo vehiculoPrincipal;
    private LinkedList<Vehiculo> vehiculos;

    public Propietario(String nombre, String edad, String cedula, String email, String celular, Vehiculo vehiculoPrincipal) {
        super(nombre, edad);
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.vehiculoPrincipal = vehiculoPrincipal;
        this.vehiculos = new LinkedList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public void setVehiculoPrincipal(Vehiculo vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo (Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public String toString() {
        return "\n\nPropietario [" + super.toString() + ", cedula=" + cedula + ", email=" + email + ", celular=" + celular + ", Vehiculo(s)= " + vehiculoPrincipal + "]";
    }
    
}
