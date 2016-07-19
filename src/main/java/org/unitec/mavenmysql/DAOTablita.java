 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.mavenmysql;

/**
 *
 * @author T-107
 */
import java.sql.*;
public class DAOTablita {
    /**
     * 
     * @param t Este argumento es el objeto de tippo tablita que deseas guardar 
     * @throws Exception 
     */
   public static void  guardar(Tablita t)throws Exception{
       //paso 1 conectarnos a mysql 
       Connection con=Conexion.conectarse("root", null );
       
       //Paso 2 Generar el Statement de sql con la conexion 
       
       PreparedStatement pr=con.prepareStatement("insert into tablita(nombre,sueldo) values(?,?)");
       
       pr.setString(1, t.getNombre());
       pr.setFloat(2, t.getSueldo());
       pr.execute();
       System.out.println("Objeto tablita guardado con exito");
       
       
       
        
   }
}
