/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_base_datos;

/**
 *
 * @author Geo
 */
public class Conexion_base_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instaciamos el archivo conexion
        conexion ver_conexion = new conexion();
        //le damos la propiedad visible para ver el frame con la conexion
        ver_conexion.setVisible(true);
        
    }
    
}
