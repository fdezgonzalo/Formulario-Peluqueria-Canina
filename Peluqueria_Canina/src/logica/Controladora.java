package logica;

import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlper = new ControladoraPersistencia ();
    
    public void crearCliente (int id_cliente, String num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String cel_duenio, String observaciones) {
       
        clientes clie = new clientes();
        
        clie.setId_cliente(id_cliente);
        clie.setNum_cliente(num_cliente);
        clie.setNombre_perro(nombre_perro);
        clie.setRaza(raza);
        clie.setColor(color);
        clie.setAlergico(alergico);
        clie.setAtencion_especial(atencion_especial);
        clie.setNombre_duenio(nombre_duenio);
        clie.setCel_duenio(cel_duenio);
        clie.setObservaciones(observaciones);
        
        controlper.crearCliente(clie);
        
    }
    
    public void crearCliente (clientes clie) {
        controlper.crearCliente(clie);
    }
    
    public void eliminarCliente (clientes clie) {
        controlper.eliminarCliente(clie);
    }
    
    public List <clientes> obtenerClientes () {
        return controlper.obtenerClientes();
    }
    
    public void modificarCliente (clientes clie) {
        controlper.modificarClientes(clie);
    }
    
    public clientes buscarCliente (clientes clie) {
        return controlper.buscarCliente(clie);
    }

    public void crearCliente(SingularAttribute<clientes, Integer> id_cliente, String num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String cel_duenio, String observaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
