
package vista;

import javax.swing.JOptionPane;


public class Validaciones {
    
    public Boolean esDNI(String dni){
        int longitud = dni.length();
        if(longitud == 8){
           try{
               Integer.parseInt(dni);
               return true;
           }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros", "DNI", JOptionPane.WARNING_MESSAGE);
                return false;
           }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar 8 numeros", "DNI", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public boolean esNumero(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Debe ingresar numeros", "Tipo de Dato", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public boolean esPrecio(String numero){
        try{
            Double.parseDouble(numero);
            return true;
        }catch(NumberFormatException dfe){
            JOptionPane.showMessageDialog(null, "Debe ingresar precio", "Tipo de Dato", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }    
}
