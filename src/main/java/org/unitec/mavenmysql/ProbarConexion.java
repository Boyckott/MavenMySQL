/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.mavenmysql;

import java.sql.*;

public class ProbarConexion {
    public static void main(String[] args) {
        try{
            Connection con= Conexion.conectarse("root",null);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
