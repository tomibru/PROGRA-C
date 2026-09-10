package punto4;

public abstract class Vehiculo {
    protected String patente;
    protected double precioBase=500;

    public Vehiculo(String p){
        this.patente=p;
    }

    public String getPatente(){
        return this.patente;
    }

    /**
     * Retorna el precio real a este vehiculo
     * Pre: Dias tiene que ser mayor a 0
     * Post: Retorna el precio real del vehiculo corespondiente
     * @param dias Cantidad de dias de alquiler
     * @return El precio del alquiler
     */
    public abstract double getPrecioreal(int dias);
    /**
     * Establece el precio base del producto
     * Pre: El precio base p debe ser mayor o igual a 0
     * Post: Asignara el monto asigando a la varibale p
     * @param p representa el precio base 
    */
    public void setPrecioBase(double p){
        assert precioBase >= 0: "El precio base no debe ser negativo";
        this.precioBase=p;
    }
    public double getPrecioBase(){
        return this.precioBase; 
    }

}
