/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.mavenmysql;

import java.sql.*;

public class Conexion {
    //creamos un metodo para conectarnos
    
    public static Connection conectarse(String usuario, String password)throws Exception{
        
        //generamos un String que es la cadena de conexion 
        String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
        
        //cargamos el driver
        Class.forName("com.mysql.jdbc.Driver");
        //conectarnos
        Connection con= DriverManager.getConnection(url, usuario, password);
        System.out.println("CONECTADO CON EXITO ! ! ");
        return con;
        
    }
    
}