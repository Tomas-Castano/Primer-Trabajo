package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte("La carreta");

        VehiculoCarga camion = new VehiculoCarga("001-ABC", "No sé", "Tampoco se", "Rojo como Optimus Prime", "Tampoco se", 900, 10);
        VehiculoTransporte bus = new VehiculoTransporte("002-CBA", "Este no me lo sé", "No tengo ideas profe", "Asi que", "pongo texto al azar", 30);
        
        Usuario usuario1 = new Usuario("Juan", "30", 70);
        Usuario usuario2 = new Usuario("Pedro", "24", 82);

        Propietario propietario1 = new Propietario("Carlitos", "40", "00000001", "Carlitos@gmail.com", "1000000", bus);

        bus.agregarUsuario(usuario1);
        bus.agregarUsuario(usuario2);
        propietario1.agregarVehiculo(camion);

        empresaTransporte.agregarUsuario(usuario1);
        empresaTransporte.agregarUsuario(usuario2);
        empresaTransporte.agregarVehiculoCarga(camion);
        empresaTransporte.agregarVehiculoTransporte(bus);
        empresaTransporte.agregarPropietario(propietario1);

        empresaTransporte.mostrarMensaje(empresaTransporte.toString());
        
    }
}
