public class Intermedio extends Permanente{
    public Intermedio(String n, String d, double s){
        super(n, d, s);
    }

    @Override
    public double calcularSueldo(){
        double sueldoBruto;
        
        sueldoBruto= this.sueldoBase+this.sueldoBase*0.25+ sueldoBase*0.1*this.getAntiguedad();

        return calcularAportes(sueldoBruto);
    }
} 