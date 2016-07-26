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
   
   public static Tablita buscarPorId(int id)throws Exception{
       Connection con=Conexion.conectarse("root", null);
       Statement st=con.createStatement();
       Tablita t= new Tablita();
        ResultSet res=st.executeQuery("select * from tablita where id="+id);
        while(res.next()){
            // A esto se le llama mapeo 
            t.setId(res.getInt("id"));
            t.setNombre(res.getString("nombre"));
            t.setSueldo(res.getFloat("sueldo"));
            
        }
        return t;
   }
   
}
