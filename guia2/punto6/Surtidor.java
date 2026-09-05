package punto6;

public class Surtidor {
    private int cantGasoil, cantSuper, cantPremium;
    private final int maximaCarga=20000;
    private int contVentasSuper, contVentasGasoil, contVentasPremium;
    private float litrosSuper, litrosGasoil, litrosPremium;

    //Metodos
    public Surtidor(){
        cantGasoil = maximaCarga;
        cantSuper = maximaCarga;
        cantPremium = maximaCarga;
        contVentasSuper = 0;
        contVentasGasoil = 0;
        contVentasPremium = 0;
        litrosGasoil = 0;
        litrosSuper = 0;
        litrosPremium = 0;
    }
    public boolean extraerGasoil(int litros){
        if(cantGasoil >= litros){
            cantGasoil -= litros;
            contVentasGasoil++;
            litrosGasoil += litros;
            return true;
        }else{
            cantGasoil = 0;
            contVentasGasoil++;
            litrosGasoil += cantGasoil;
            return false;
        }
    }
    public boolean extraerSuper(int litros){
        if(cantSuper >= litros){
            cantSuper -= litros;
            contVentasSuper++;
            litrosSuper += litros;
            return true;
        }else{
            contVentasSuper++;
            litrosSuper += cantSuper;
            cantSuper = 0;
            return false;
        }
    }
    public boolean extraerPremium(int litros){
        if(cantPremium >= litros){
            cantPremium -= litros;
            contVentasPremium++;
            litrosPremium += litros;
            return true;
        }else{
            contVentasPremium++;
            litrosPremium += cantPremium;
            cantPremium = 0;
            return false;  
        }
    }
    public int getCantGasoil(){
        return cantGasoil;
    }
    public int getCantVentasGasoil(){
        return contVentasGasoil;
    }
    public int getCantSuper(){
        return cantSuper;
    }
    public int getCantVentasSuper(){
        return contVentasSuper;
    }
    public int getCantPremium(){
        return cantPremium;
    }
    public int getCantVentasPremium(){
        return contVentasPremium;
    }
    void llenarDepositoGasoil(){
        cantGasoil = maximaCarga;
    }
    void llenarDepositoSuper(){
        cantSuper = maximaCarga;
    }
    void llenarDepositoPremium(){
        cantPremium = maximaCarga;
    }
    public float getLitrosGasoil(){
        return litrosGasoil;
    }

    public float getLitrosSuper(){
        return litrosSuper;
    }

    public float getLitrosPremium(){
        return litrosPremium;
    }
}
