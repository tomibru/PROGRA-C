import java.util.*;

public class Departamento{
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<PlanillaInformativa> planillas;

    public void setNombre(String n){
        this.nombre =n;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

}