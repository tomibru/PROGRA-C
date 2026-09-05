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
    public boolean eliminarEmpleado(Empleado e){
        int i=0;
        while(i < empleados.size() && empleados.get(i) != e)
            i++;
        if(i => empleados.size())
            return false
        else{
            empleados.remove(e);
            return true;
        }
    }

    public void hacerPlanillas(){
        int i;
        for(i=0; i < empleados.size(); i++)
            planillas.add(new PlanillaInformativa(empleados.get(i).getNombre(), empleados.get(i).calcularSueldo()));
    }

}