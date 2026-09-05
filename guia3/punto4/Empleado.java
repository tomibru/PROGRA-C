import java.util.*;

public abstract class Empleado{
    private String nombre;
    private static int proximoLegajo=1;
    private int legajo;
    private String domicilio; 

    public Empleado(String n, String d){
        this.nombre = n;
        this.domicilio = d;
        this.legajo = proximoLegajo;
        proximoLegajo++;
    }

    public abstract double calcularSueldo();


}