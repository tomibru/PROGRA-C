import java.util.*;

public abstract class Permanente extends Empleado{
    protected int antiguedad;
    protected double sueldoBase;
    private static double aportes = 0.17; 

    public Permanente(String n, String d, double s){
        super(n, d);
        this.sueldoBase = s;
        this.antiguedad=0;
    }
    
    public void setAntiguedad(int a){
        this.antiguedad=a;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }

    public double calcularAportes(double sueldoBruto){
        return sueldoBruto - sueldoBruto*aportes;
    }

}