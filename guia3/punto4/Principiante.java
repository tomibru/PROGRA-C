public class Principiante extends Permanente{
    public Principiante(String n, String d, double s){
        super(n, d, s);
    }

    @Override
    public double calcularSueldo(){
        double sueldoBruto;
        if(this.getAntiguedad() >=2 && this.getAntiguedad()<=5)
            sueldoBruto= this.sueldoBase + this.sueldoBase*0.05;
        else
            if(this.getAntiguedad() >5 && this.getAntiguedad()<=10)
                sueldoBruto= this.sueldoBase + this.sueldoBase*0.07;
            else
                if(this.getAntiguedad() >10 && this.getAntiguedad()<=15)
                    sueldoBruto= this.sueldoBase + this.sueldoBase*0.1;
                else
                    if(this.getAntiguedad() >15 && this.getAntiguedad()<=20)
                        sueldoBruto= this.sueldoBase + this.sueldoBase*0.15;
                    else
                        sueldoBruto= this.sueldoBase + this.sueldoBase*0.2;
        return calcularAportes(sueldoBruto);

    }
} 