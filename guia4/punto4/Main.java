package punto4;
public class Main{
    public static void main(String[] args){
        Vehiculo v;
        Empresa e = new Empresa("Microsoft");

        v = new Auto("ASD 200",5);
        e.agregarVehiculo(v);
        v = new Auto("ASD 201",4);
        e.agregarVehiculo(v);
        v = new Auto("ASD 233",3);
        e.agregarVehiculo(v);
        v = new Camion("ASD 202");
        e.agregarVehiculo(v);
        v = new Camion("ASD 250");
        e.agregarVehiculo(v);
        v = new Camion("ASD 267");
        e.agregarVehiculo(v);
        v = new Camioneta("ASD 255",1.5);
        e.agregarVehiculo(v);
        v = new Camioneta("ASD 221",2);
        e.agregarVehiculo(v);
        v = new Combi("ASD 278",6);
        e.agregarVehiculo(v);
        v = new Combi("ASD 290",6);
        e.agregarVehiculo(v);

        e.mostrarAlquileres();
    }
}