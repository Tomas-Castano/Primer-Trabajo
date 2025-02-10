package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class EmpresaTransporte {
    private String nombre;
    private LinkedList<Propietario> propietarios;
    private LinkedList<VehiculoCarga> vehiculoCargas;
    private LinkedList<VehiculoTransporte> vehiculoTransportes;
    private LinkedList<Usuario> usuarios;
    
    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        this.vehiculoCargas = new LinkedList<>();
        this.vehiculoTransportes = new LinkedList<>();
        this.usuarios = new LinkedList<>();
        this.propietarios = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(LinkedList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public LinkedList<VehiculoCarga> getVehiculoCargas() {
        return vehiculoCargas;
    }

    public void setVehiculoCargas(LinkedList<VehiculoCarga> vehiculoCargas) {
        this.vehiculoCargas = vehiculoCargas;
    }

    public LinkedList<VehiculoTransporte> getVehiculoTransportes() {
        return vehiculoTransportes;
    }

    public void setVehiculoTransportes(LinkedList<VehiculoTransporte> vehiculoTransportes) {
        this.vehiculoTransportes = vehiculoTransportes;
    }

    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarPropietario (Propietario propietario) {
        propietarios.add(propietario);
    }

    public void agregarVehiculoCarga (VehiculoCarga vehiculoCarga) {
        vehiculoCargas.add(vehiculoCarga);
    }

    public void agregarVehiculoTransporte (VehiculoTransporte vehiculoTransporte) {
        vehiculoTransportes.add(vehiculoTransporte);
    }

    public void agregarUsuario (Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public String toString() {
        return "EmpresaTransporte [nombre=" + nombre + "\nPropietarios=" + propietarios + "\n\nVehiculoCargas="
                + vehiculoCargas + "\n\nVehiculoTransportes=" + vehiculoTransportes + "\nUsuarios=" + usuarios + "]";
    }

    public void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }
}
