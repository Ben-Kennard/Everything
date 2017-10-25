/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author beken8519
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle spot1 = new Circle(5);
        Circle spot2 = new Circle(4);
        
        if(spot1.equals(spot2)){
            System.out.println("The objects are equal");
        } else {
            System.out.println("The obects are not equal");
        }
        System.out.println(spot1);
        System.out.println(spot2);
        //System.out.println("Circle radius: " + spot1.getRadius());
       // System.out.println("Circle area: " + spot1.area());
       // spot1.displayAreaFormula();
    }

}
