/*Escribe una clase Prueba, que contendrá un método main, en el cual deberás instanciar
empleados, y productos, para poder armar un pedido. ¿De quién sería la responsabilidad
de conservar la lista de empleados y los pedidos?  */

import java.util.ArrayList;
public class prueba{
    public class Empresa{
        private ArrayList<Empleado> empelados;
        private ArrayList<Producto> productos;
    }

    public class Empleado{
        private String nombre, telefono, email;

        public Empleado(String n,String t, String e){
            this.nombre = n;
            this.telefono = t;
            this.email = e;
        }


    }
    public class Producto{
        private int codigo;
        private String descripcion;
        private double precioU;

        public Producto(int c, String d, double p){
            this.codigo=c;
            this.descripcion= d;
            this.precioU = p;
        }
    }
    public class Pedido{
        private Empleado responsable;
        private String fecha;
        private ArrayList<LineaDePedido> lineasDePedido;

        public Pedido(int cant, Producto producto, Empleado responsable, String fecha ){

            this.responsable = responsable;
            this.fecha = fecha;
            this.lineasDePedido = new ArrayList<LineaDePedido>();
            lineasDePedido.add(new LineaDePedido(producto,cant));
        }
    }
    public class LineaDePedido{
        private Producto producto;
        private int cant;

        public LineaDePedido(Producto producto, int cant){
            this.producto = producto;
            this.cant = cant;
        }
    }
}