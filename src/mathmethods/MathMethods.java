/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmethods;
import java.text.*;
/**
 *
 * @author rkaune
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double myNumberRounded;
        double myNumber=15.4;
        double pi = Math.PI;
        myNumberRounded = (double) Math.round(myNumber);
        DecimalFormat x = new DecimalFormat("#.####");
        myNumber *=10; 
        myNumber +=5;
        myNumber /=10;
        myNumber -=10;
        myNumber = Math.E;
        myNumber /= Math.PI;
        myNumber /= Math.tan(5);
        myNumberRounded =(double)(myNumber);
        System.out.println( x.format(myNumber));
    }
    
}