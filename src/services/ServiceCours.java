/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.cours;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDb;


public class ServiceCours implements IService<cours> {

    private Connection cnx;

    public ServiceCours() {
        cnx = MyDb.getInstance().getcnx();
    }

    @Override
    public void ajouter(cours t) {
        try {
            String query = "INSERT INTO `cours`( `contenu`, `date_creation`,`Date_modif`, `type_cours`) VALUES ('" + t.getContenu() + "','" + t.getDate_creation() + "','" + t.getDate_modif() + "','" + t.getType_cours() + "')";
            Statement stm = cnx.createStatement();

            stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public List<cours> afficher() {
          List<cours> cours = new ArrayList();
          
        try {
            
            String query="SELECT * FROM `cours`";
            Statement stm = cnx.createStatement();
            
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
            cours c = new cours();
            
           
            c.setContenu(rs.getString("contenu"));
            c.setDate_creation(rs.getDate(3));
            c.setDate_modif(rs.getDate(3));
            c.setType_cours(rs.getString("type_cours"));
            
            cours.add(c);
            }
            
            return cours;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    return cours;
    }

    @Override
    public void modifier(cours t) {
    }

    @Override
    public void supprimer(cours t) {
    }

}
