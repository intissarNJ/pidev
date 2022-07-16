/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Intissar
 */

public class cours {
    private int id_cours;
    private String contenu;
    private Date date_creation;
    private Date date_modif;
    private String type_cours;
    private User user;
    private Categorie categorie;

    public cours(int id_cours, String contenu, Date date_creation, Date date_modif, String type_cours, User user, Categorie categorie) {
        this.id_cours = id_cours;
        this.contenu = contenu;
        this.date_creation = date_creation;
        this.date_modif = date_modif;
        this.type_cours = type_cours;
        this.user = user;
        this.categorie = categorie;
    }

    public cours() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Date getDate_modif() {
        return date_modif;
    }

    public void setDate_modif(Date date_modif) {
        this.date_modif = date_modif;
    }

    public String getType_cours() {
        return type_cours;
    }

    public void setType_cours(String type_cours) {
        this.type_cours = type_cours;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
   @Override
   public String toString() {
        return "Cours{" + "id=" + id_cours + 
                ", conetnu=" + contenu + ", date creation="
                + date_creation + ", date modification" + date_modif +", type de cours" + type_cours
                + ", user" + user + ", categorie"+ categorie;
    }
}

