/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Stas
 */
public class MePoints {
    int x,y;

    public MePoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int[] getXY() {
        int[] result = {x,y};
        return result;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MePoints{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double distance(int x,int y){
        double result  = sqrt(  (this.x - x)*(this.x - x)       +     (this.y-y)*(this.y-y) );
        return result;
    }
    public double distance(){
        double result  = sqrt(  (this.x - 0)*(this.x - 0)       +     (this.y-0)*(this.y-0) );
        return result;
    }
    public double distance(MePoints f){
        double result  = sqrt(  (this.x - f.x)*(this.x - f.x)       +     (this.y-f.y)*(this.y-f.y) );
        return result;
    }
    
    
}
