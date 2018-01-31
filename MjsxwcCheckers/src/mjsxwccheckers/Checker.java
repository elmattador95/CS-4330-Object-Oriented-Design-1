/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwccheckers;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Matthew
 */
public class Checker {
    int	numRows;
    int numCols;
    double boardWidth;
    double boardHeight;
    Color lightColor;
    Color darkColor;
    
    
    public Checker (int	numRows, int numCols, double boardWidth, double boardHeight){
        this(numRows,numCols,boardWidth,boardHeight, Color.RED, Color.BLACK);
        

    }
    public Checker (int	numRows, int numCols, double boardWidth, double boardHeight,Color lightColor,Color darkColor){
        this.numCols = numCols;
        this.numRows = numRows;
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public AnchorPane build(double boardWidth, double boardHeight, AnchorPane anchorPane){
        anchorPane.setPrefWidth(boardWidth);
        anchorPane.setPrefHeight(boardHeight);
        
        double theWidth = getRectangleWidth();
        double theHeight = getRectangleHeight();
        
         for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Color color = nextColor(row,col);
                Rectangle rect = new Rectangle(theWidth, theHeight, color);
                
                anchorPane.getChildren().add(rect);
                anchorPane.setTopAnchor(rect,theHeight * row);
                anchorPane.setLeftAnchor(rect,theWidth * col);
            }
        }
        
        return anchorPane;   
    }
    
    public Color nextColor(int row, int col){
        if ((col & 1) != 0)
        {
            return ((row & 1) != 0) ? lightColor : darkColor;
        }
        else
        {
            return ((row & 1) != 0) ? darkColor : lightColor;
        }
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardHeight() {
        return boardHeight;
    }

    public Color getLightColor() {
        return lightColor;
    }

    public Color getDarkColor() {
        return darkColor;
    }
    
    public double getRectangleWidth(){
        int width = (int) Math.ceil( boardWidth / numCols);
        return width;
    }
    
    public double getRectangleHeight(){
        int height = (int) Math.ceil( boardHeight / numRows);
        return height;
    }
}
