/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EdwinAlejandro
 */
public class Conexion {
    String base;
    String user;
    String pass;
    java.sql.Connection conn;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public java.sql.Connection conectar() {
        base = "jdbc:mysql://localhost/opticaandes";
        user = "root";
        pass = "";

        try {
            conn = (java.sql.Connection) DriverManager.getConnection(base, user, pass);
            System.out.println("Conexión a la Base de Datos exitosa!");
        } catch (SQLException ex) {
            System.out.println("No se pudo concretar la conexión con la base de datos");
        }
        return conn;
    }

}
