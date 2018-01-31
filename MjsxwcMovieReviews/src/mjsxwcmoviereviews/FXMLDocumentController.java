/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwcmoviereviews;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Matthew
 */
public class FXMLDocumentController implements Initializable {
    private Stage stage;
    public String search = "apprentice";
    @FXML
    private Label label;
    
    @FXML
    private TextField text;
    
    @FXML
    private ListView list_view;
    
    @FXML
    private WebView web_view;
    
    ObservableList<String> content;
    List<Reviews> list;
    
    private WebEngine site;
   
    
    @FXML
    public void ready(Stage stage){
       this.stage = stage;
       site = web_view.getEngine();
       content = FXCollections.observableArrayList();
       list_view.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) ->{
            Reviews story = list.get((int)new_val);
            site.load(story.jimmy);
            
       });
       
       text.setText(search);
       loadNews();
    }
    private void loadNews(){
        list = Reviews.estevez();
        content.clear();
        
        list.stream().forEach(result -> content.add(result.carl));
        
        list_view.setItems(content);
        
        if (list.size() > 0) {
            list_view.getSelectionModel().select(0);
            list_view.getFocusModel().focus(0);
            list_view.scrollTo(0);
        }
    
    }
         
    @FXML
    private void handleSearch(ActionEvent event) {
        search = text.getText();
        loadNews();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
