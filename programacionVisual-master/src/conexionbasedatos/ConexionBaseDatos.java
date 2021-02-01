/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import com.istloja.conexionbd.Conexion;
import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.vistas.GestionPersona;

/**
 *
 * @author johnp
 */
public class ConexionBaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personabd personabd = new Personabd();
        //System.out.println("PERSONAS: "+personabd.obtenerPersonas() );
//        for (Persona arg : personabd.obtenerPersonas()) {
//            System.out.println(arg);
//        }
//        Persona persona = new Persona(4,"110425555","John Patricio EJE2","Solano","Loja","jpsolanoc@gmail.com","0979256768");
//        if (personabd.registrarPersona(persona)) {
//            System.out.println("Persona registrada en la base de datos.");
//        }else{
//            System.out.println("Error al guardar los datos.");
//        }
//        Persona persona = new Persona(1);
//        if (personabd.eliminar(persona)) {
//            System.out.println("Persona Eliminada del sistema.");
//        } else {
//            System.out.println("No se pudo eliminar");
//        }
        GestionPersona gestionPersona = new GestionPersona();

    }
    
}


//        persona.setIdPersona(2);
//        persona.setCedula("110425555");
//        persona.setNombre("John");
//        persona.setApellidos("Solano");
//        persona.setDireccion("Loja");
//        persona.setCorreo("jpsolanoc@gmail.com");
//        persona.setTelefono("0979256768");