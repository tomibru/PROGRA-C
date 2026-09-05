package punto7;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public boolean nombreExistente(String nombre){
        int i=0;
        while(i < contactos.size() && nombre != contactos.get(i).getNombre()){
            i++;
        }
        return (i < contactos.size());
    }

    public boolean agregarContacto(String nombre, String telFijo){
        if(nombreExistente(nombre))
            return false;
        else{
            contactos.add(new Contacto(nombre, telFijo));
            return true;
        }
    }
    public boolean eliminarContacto(String nombre){
        int i=0;
        while(i< contactos.size() && nombre != contactos.get(i).getNombre())
            i++;
        if(i< contactos.size()){
            contactos.remove(i);
            return true;
        }else
            return false;
    }
    public Contacto buscarXNombre(String nombre){
        int i=0;
        while(i< contactos.size() && nombre != contactos.get(i).getNombre())
            i++;
        if(i< contactos.size())
            return contactos.get(i)
        else
            return null;
    }

    public void mostrarContactos(){
        int i;
        for(i=0 ; i< contactos.size(); i++)
            System.out.println(contactos.get(i).getNombre());
    }

}
