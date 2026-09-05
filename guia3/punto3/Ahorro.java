import java.util.*;

public class Ahorro extends Cuenta{
    private int cantidadExtraciones;
    private static int maximoExtracciones = 20;//?


    public Ahorro(String t){
        super(t);
        this.cantidadExtraciones = 0;
    }
    public int  getCantExtracciones(){
        return this.cantidadExtraciones;
    }

    @Override
    public boolean extraer(double importe){
        if(this.getCantExtracciones() <= maximoExtracciones){
            this.saldo -= importe;
            this.cantidadExtraciones++;
            return true;
        }else
            return false;
    }
}