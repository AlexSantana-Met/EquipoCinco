/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EdwinAlejandro
 */
public class NewClass {

    Connection conn;
    Statement st;
    
    public Connection conecta() {
        Conexion co = new Conexion();
        conn = co.conectar();
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {

        }
        return conn;
    }
    
    public String listar() {
        ResultSet rs;
        String sql = "select * from clientes";
        String s = "";
        System.out.println(sql);
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                s = s + "\n\tID: " + rs.getInt("id_emp")
                        + "\n\tNombre: " + rs.getString("nombre")
                        + "\n\tApP: " + rs.getString("app")
                        + "\n\tApM: " + rs.getString("apm")
                        + "\n\tPass: " + rs.getString("passw")
                        + "\n\tEmail: " + rs.getString("correo")
                        + "\n\tUsuario: " + rs.getString("usuario")
                        + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return s;
    }
    
}
