/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.lang.reflect.Array;


public class Book {
    private String name;
    private Employee[] authors;
    private double price;
    private int qty;
    public Book(String name,Employee author,double price,int qty){
        this.authors = new Employee[1];
        this.authors[0] = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
    public Book(String name,Employee[] authors,double price,int qty){
        
        //authors = new Employee[100];
        this.authors = authors;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(double price){
        this.price = price;
    }  
    public void setQty(int qty){
        this.qty = qty;
    }
    
    
    
    public String getName(){
        return this.name;
    }
    public Employee[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }
    public String getAuthorsName(){
        String result = " {";
        int n =0;
        for (Employee author : authors) {
            n++;
            result +=String.valueOf(n) +"  "+ author.toStringBook();
        }
        result += "}";
        return result;
    }
    
    
    @Override
    public String toString(){
        String result = "Book: Name = " + this.name + " Authors = " + this.getAuthorsName() + " Price = " + this.price+" Qty = "+qty;
        return result;
    }
    
    
    
    
    
    
    
}
