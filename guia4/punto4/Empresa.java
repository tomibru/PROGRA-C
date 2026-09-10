package punto4;
import java.util.*;
public class Empresa {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Empresa(String n){
        this.nombre=n;
        vehiculos = new ArrayList<Vehiculo>();
    }

    /**
     * Pre:
     * La variable n tiene que ser distinta de vacio
     * @param n 
     * Post:
     * El nombre sera reemplazado por el ingresado
     */
    public void setNombre(String n){
        this.nombre=n;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    /**
     * El objeto vehiculo ingresado debe existir dentro del ArrayList
     * @param v 
     * El objeto ingresado sera eliminado
     */
    public void eliminarVehiculo(Vehiculo v){
        vehiculos.remove(v);
    }

    public void mostrarAlquileres(){
        int i, dias=0;
        for(i=0; i < vehiculos.size(); i++){
            dias++;
            System.out.println("Patente :" + vehiculos.get(i).getPatente() + "| Precio de alquiler: " + vehiculos.get(i).getPrecioreal(dias));
        }
    }
}
