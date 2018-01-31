/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwcdaledoesxml;

/**
 *
 * @author Matthew
 */
public class Dale {
    private String name;
    private String price;
    private String description;
    private String calories;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    
    public String getprice(){
        return price;
    }
    public void setprice(String price){
        this.price = price;
    }
    
    public String getdescription(){
        return description;
    }
    public void setdescription(String description){
        this.description = description;
    }
    
    public String getcalories(){
        return calories;
    }
    public void setcalories(String calories){
        this.calories = calories;
    }
    
    public String hail(){
        String whale = "Name =" + this.name +"Price =" + this.price + "Desription =" + this.description + "Calories =" + this.calories;
        return whale;
    }
    
}

