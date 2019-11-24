/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Conexion;
import modelo.Huesped;
import modelo.HuespedData;

/**
 *
 * @author Engel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Huesped huesped = new Huesped("German", 33800812, "Libertad", "engelgerman@gmail.com", "2664549986");
        
        Conexion con = new Conexion();
        
        HuespedData hd = new HuespedData(con);
        
        hd.agregarHuesped(huesped);
        
        
        
        
    }
    
}
