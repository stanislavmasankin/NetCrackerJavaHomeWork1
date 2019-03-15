/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import static java.lang.Math.PI;

public class Rectangle {
    private float lenght = 10; 
    private float width = 10;
    
    public Rectangle(){}
    
    public Rectangle(float lenght,float width){
        this.lenght = lenght;
        this.width = width;
    }
    public float getWidth(){
        return this.width;
    }
    public float getLenght(){
        return this.lenght;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public void setLenght(float lenght){
        this.lenght = lenght;
    }
    @Override
    public String toString(){
        String result = "Rectangle: Lenght = " + lenght + ". Width = " + width + ".";
        return result;
    }
    public double getArea(){
        double result = lenght*width;
        return result;        
    }
    public double getPerimetr(){
        double result = 2*(lenght+width);
        return result;        
    }

}
