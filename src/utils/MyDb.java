/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Intissar
 */

public class MyDb {
final private String URL ="jdbc:mysql://127.0.0.1:3306/educatly";
final private String USERNAME ="root";
final private String PWD ="";
 static private Connection cnx;
static private MyDb instance;
 
private MyDb(){
 
    try {
        cnx =DriverManager.getConnection(URL, USERNAME, PWD);
    } catch (SQLException ex) {
       System.out.println(ex.getMessage());
   }
 
}
 
 static public MyDb getInstance (){
   if (instance == null)
      instance=new MyDb();
    
     return instance;
 }
static public  Connection getCnx(){
    return cnx;
}

    public Connection getcnx() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

