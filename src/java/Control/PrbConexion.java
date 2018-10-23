/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;

/**
 *
 * @author EdwinAlejandro
 */
public class PrbConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn;
        NewClass csql;
        csql = new NewClass();
        conn = csql.conecta();
        System.out.println(csql.listar());
    }

}
