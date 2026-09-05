public class Temporario extends Empleado{
    private double sueldoXhora;
    private int cantHoras;

    public Temporario(String n, String d, double s){
        super(n, d);
        this.sueldoXhora = s;
        this.cantHoras=0;
    }
    public double getSueldoxHora(){
        return this.sueldoXhora;
    }
    public int getHoras(){
        return this.cantHoras;
    }
    @Override
    public double calcularSueldo(){
        return this.getSueldoxHora()*this.getHoras();
    }

}