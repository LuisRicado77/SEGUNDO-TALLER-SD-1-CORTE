/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolipermiservidorimc;
import ejemplolipermiservidorimc.net.Servidor;

/**
 *
 * @author ldric
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Servidor servicio = new Servidor();
        try{
            servicio.iniciar();
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
