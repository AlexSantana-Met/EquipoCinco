/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Control.forma;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "cliente")
@RequestScoped
public class cliente {
    final forma[] nadado = new forma[]{
        
        new forma("17/05/18", "servicios", "consulta", "quiero saber si puedo reservar una consulta el 20/05/18 a las 8 de la mañana","En tranmite"),
        new forma("10/05/18", "peticiones", "sugerencia", "Deberian tener mejor atencion al cliente en la sucursal","En tranmite")};

   

   
    /**
     * Creates a new instance of cliente
     */
    public cliente() {
    }
    
     public forma[] getNadado() {
        return nadado;
    }
}
