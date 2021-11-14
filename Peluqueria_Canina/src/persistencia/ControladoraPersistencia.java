package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.clientes;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    clientesJpaController clieJPA = new clientesJpaController ();
    
    //Crear cliente
    public void crearCliente (clientes clie) {
        clieJPA.create(clie);
    }
    
    //Eliminar cliente
    public void eliminarCliente (clientes clie) {
        try {
            clieJPA.destroy(clie.getId_cliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Lectura clientes
    public List <clientes> obtenerClientes () {
        return clieJPA.findclientesEntities();
    } 
    
    //Modificar cliente
    public void modificarClientes (clientes clie) {
        try {
            clieJPA.edit(clie);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Buscar cliente
    public clientes buscarCliente (clientes clie) {
        return clieJPA.findclientes(clie.getId_cliente());
    }

}
