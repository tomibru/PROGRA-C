package punto7;
import java.util.ArrayList;

public class Contacto {
    private String nombre, telefonoFijo;
    private ArrayList<String> numerosCelurlares;

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefonoFijo(){
        return this.telefonoFijo;
    }

    public Contacto(String nombre, String telefonoFijo){
        this.nombre = nombre;
        this.telefonoFijo = telefonoFijo;
        this.numerosCelurlares = new ArrayList<String>();
    }

    public void añadirCelular(String numero){
        numerosCelurlares.add(numero);
    }
}
