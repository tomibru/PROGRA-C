public class Experto extends Permanente{
    public Experto(String n, String d, double s){
        super(n, d, s);
    }

    @Override
    public double calcularSueldo(){
        double sueldoBruto;
        
        sueldoBruto= this.sueldoBase+this.sueldoBase*0.5+ sueldoBase* 0.15 *this.getAntiguedad();

        return calcularAportes(sueldoBruto);
    }
} 