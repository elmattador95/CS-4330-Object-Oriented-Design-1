/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwccheckers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Matthew
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML   
    private AnchorPane anchorPane;
    int	numRows = 8;
    int numCols = 8;
    double boardWidth = 550;
    double boardHeight = 550;
    Color lightColor =  Color.SKYBLUE;
    Color darkColor = Color.DARKBLUE;
    
    public void begin(){
        Checker checkerpiece = new Checker(numRows,numCols, boardWidth,boardHeight);
        anchorPane = checkerpiece.build(boardWidth, boardHeight, anchorPane);
    }
    @FXML
    private void render16(ActionEvent event){
        numRows = 16;
        numCols =16;
        begin();
    }
    @FXML
    private void render10(ActionEvent event){
        numRows = 10;
        numCols = 10;
        begin();
    }
    @FXML
    private void render8(ActionEvent event){
        numRows = 8;
        numCols = 8;
        begin();
    }
    @FXML
    private void render3(ActionEvent event){
        numRows = 3;
        numCols = 3;
        begin();
    }
    
    @FXML 
    public void color(ActionEvent event){
        Checker checkerpiece = new Checker(numRows, numCols, boardWidth, boardHeight, lightColor, darkColor);
        anchorPane = checkerpiece.build(boardWidth, boardHeight, anchorPane);
  
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
