/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejemplo.luis.imc.rmi.lib;

import java.io.Serializable;


/**
 *
 * @author ldric
 */
public interface IRemotaCalculoImc {
    public DatosImc calcularImc(DatosImc datos);
}
