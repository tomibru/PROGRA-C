package punto6;
import java.util.ArrayList;

public class Estacion {
    private String direccion;
    private ArrayList<Surtidor> surtidores;

    //METODOS


    public Estacion(){
        this.surtidores = new ArrayList<Surtidor>();
    }
    public void agregarSurtidor(surtidor s){
        surtidores.add(s);
    }
    public int cantidadSurtidores(){
        return surtidores.size();
    }
    public int totalGasoil(){
        int i, cont =0;
        for(i=0; i < surtidores.size(); i++){
            cont += surtidores.get(i).getCantGasoil();
        }
        return cont;
    }
    public int totalSuper(){
        int i, cont =0;
        for(i=0; i < surtidores.size(); i++){
            cont += surtidores.get(i).getCantSuper();
        }
        return cont;
    }
    public int totalPremium(){
        int i, cont =0;
        for(i=0; i < surtidores.size(); i++){
            cont += surtidores.get(i).getCantPremium();
        }
        return cont;
    }

    public Surtidor mayorVentasSuper(){
        Surtidor maximo= new Surtidor();
        int i;
        for(i=0;i< surtidores.size(); i++){
            if(surtidores.get(i).getCantVentasSuper() > maximo.getCantVentasSuper()){
                maximo = surtidores.get(i);
            }
        }
        return maximo;
    }
    public Surtidor mayorVentasGasoil(){
        Surtidor maximo= new Surtidor();
        int i;
        for(i=0;i< surtidores.size(); i++){
            if(surtidores.get(i).getCantVentasGasoil() > maximo.getCantVentasGasoil()){
                maximo = surtidores.get(i);
            }
        }
        return maximo;
    }
    
    public Surtidor mayorVentasPremium(){
        Surtidor maximo= new Surtidor();
        int i;
        for(i=0;i< surtidores.size(); i++){
            if(surtidores.get(i).getCantVentasPremium() > maximo.getCantVentasPremium()){
                maximo = surtidores.get(i);
            }
        }
        return maximo;
    }

    //Preguntar 4
    //HISTORICOS
    public float getHistoricoSuper(){
        float total=0;
        int i;
        for(i=0; i< surtidores.size(); i++){
            total += surtidores.get(i).getLitrosSuper();
        }
        return total;
    }

    public float getHistoricoGasoil(){
        float total=0;
        int i;
        for(i=0; i< surtidores.size(); i++){
            total += surtidores.get(i).getLitrosGasoil();
        }
        return total;
    }

    public float getHistoricoPremium(){
        float total=0;
        int i;
        for(i=0; i< surtidores.size(); i++){
            total += surtidores.get(i).getLitrosPremium();
        }
        return total;
    }

    public float getSurtidorSuper(int numSurtidor){
        return surtidores.get(numSurtidor).getLitrosSuper();
    }

    public float getSurtidorGasoil(int numSurtidor){
        return surtidores.get(numSurtidor).getLitrosGasoil();
    }

    public float getSurtidorPremium(int numSurtidor){
        return surtidores.get(numSurtidor).getLitrosPremium();
    }

}
