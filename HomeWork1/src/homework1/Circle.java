/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import static java.lang.Math.PI;


public class Circle {
    private String color = "red"; 
    private double radius =10.0;
    
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        String result = "Circle: Radius = " + radius + ". Color = " + color + ".";
        return result;
    }
    public double getArea(){
        double result = radius*radius*PI;
        return result;        
    }

}
