/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entities.cours;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.ServiceCours;

/**
 * FXML Controller class
 *
 * @author Intissar
 */
public class FXML_ListCoursController implements Initializable {

    @FXML
    private TableColumn<cours, String> id_contenu;
    @FXML
    private TableColumn<cours, Date> id_date_creation;
    @FXML
    private TableColumn<cours, Date> id_date_modif;
    @FXML
    private TableColumn<cours, String> id_type_cours;
    @FXML
    private TableColumn<cours, String> id_id_createur;
    @FXML
    private TableColumn<cours, String> id_id_categories;
    @FXML
    private TableColumn<cours, String> id_Actions;
    @FXML
    private TableView<cours> id_List_cours;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void Afficher () {
      ServiceCours sc = new ServiceCours ();
      
    ObservableList<cours> list = (ObservableList<cours>) sc.afficher();
    id_contenu.setCellValueFactory(new PropertyValueFactory<>("contenu"));
    id_date_creation.setCellValueFactory(new PropertyValueFactory<>("date_creation"));
    id_date_modif.setCellValueFactory(new PropertyValueFactory<>("date_modif"));
    id_type_cours.setCellValueFactory(new PropertyValueFactory<>("type_cours"));
    id_id_createur.setCellValueFactory(new PropertyValueFactory<>("id_createur"));
    id_id_categories.setCellValueFactory(new PropertyValueFactory<>("id_categories"));
    id_Actions.setCellValueFactory(new PropertyValueFactory<>("id_Actions"));
    id_List_cours.setItems(list);

  
    }
    
}
