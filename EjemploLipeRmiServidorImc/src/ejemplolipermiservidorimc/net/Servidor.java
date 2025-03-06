/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolipermiservidorimc.net;
import java.io.IOException;
import ejemplo.luis.imc.rmi.lib.IRemotaCalculoImc;
import net.sf.lipermi.exception.LipeRMIException;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Server;
//import ejemplolipermiservidorimc.net.CalculoRmiImcimplem;

/**
 *
 * @author ldric
 */
public class Servidor {
    private int puerto = 9007;
    private CallHandler invocador;
    private Server servidor;
    private CalculoRmiImcimplem calculoImc;
    private IRemotaCalculoImc calculoImcRemoto;
    
    public Servidor(){
        invocador = new CallHandler();
        servidor = new Server();
        calculoImc = new CalculoRmiImcimplem();
    }
    
    public void iniciar() throws Exception {
        try{
            invocador.registerGlobal(IRemotaCalculoImc.class, calculoImc);
            servidor.bind(puerto, invocador);
        }catch(LipeRMIException ex){
            throw new Exception("Error: No es posible invocar metodos remotos");
        }catch(IOException ex){
            throw new Exception("Error: I/0");
        }
    }
    
    public void detener(){
        servidor.close();
    }
}
