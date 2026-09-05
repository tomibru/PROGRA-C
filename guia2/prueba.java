import java.util.ArrayList;

public class prueba{

    public class Empresa{
        private ArrayList<Chofer> choferes;
        private ArrayList<Colectivo> colectivos;
        

        public Empresa(){
            this.choferes = new ArrayList<>();
        }
        public void agregarChofer(Chofer chofer){
            choferes.add(chofer);
        }
        public int cantidadSinColectivo(){
            int i,contador=0;
            for(i=0; i < choferes.size(); i++){
                if(!choferes.get(i).colectivoAsignado()){
                    contador++;
                }
            }
            return contador;
        }
        public int cantidadColectivos(){
            return colectivos.size();
        }
        public int cantidadDeCat(Categoria cat){
            int i, cont=0;
            for(i=0; i < choferes.size(); i++){
                if(choferes.get(i).getCategoria() == cat){
                    cont++;
                }
            }
            return cont;
        }
    }

    public class Colectivo{
        private String modelo;
        private static int cantidadColectivos=0;
        private int numeroInterno;

        public Colectivo(String modelo){
            this.modelo = modelo;
            numeroInterno = numeroInterno + 1; 
        }
        public String getModelo(){
            return modelo;
        }

    }
    public class Categoria{
        private String nombreCat;
        private double sueldo;

        public Categoria(double sueldo, String nombreCat){
            this.nombreCat = nombreCat;
            this.sueldo = sueldo;
        }

    }
    public class Domicilio{
        private String calle;
        private int numero;
    }
    public class Chofer{
        private Categoria categoria;
        private Domicilio domicilio;
        private String nombre;
        private Colectivo colectivo;

        @Override
        public String toString() {
            return "Nombre " + nombre + " Categoria: " + categoria.getCategoria() + " Domicilio: " + domicilio.getDomicilio() + " Colectivo: " + (colectivoAsignado() ? colectivo.getModelo() : "No asignado");
        }
        public Chofer(Categoria categoria, Domicilio domicilio, String nombre){
            this.categoria = categoria;
            this.domicilio = domicilio;
            this.nombre = nombre;
            this.colectivo = null;
        }
        public Chofer(Categoria categoria, Domicilio domicilio, String nombre, Colectivo colectivo){
            this(categoria, domicilio, nombre);
            this.colectivo = colectivo;    
        }
        public void asignarColectivo(Colectivo colectivo){
            this.colectivo = colectivo;
        }
        public void mostrarInfo(){
            System.out.println(this);
        }
        public boolean colectivoAsignado(){
            return colectivo != null;
        }
        public Categoria getCategoria(){
            return this.categoria;
        }
    }

    


}