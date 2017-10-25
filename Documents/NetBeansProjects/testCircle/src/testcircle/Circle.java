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
public class Circle {
    private static double PI = 3.14;
    private double radius;
    
    public Circle(double tempRadius){
        radius = tempRadius;
    }
    
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public double area(){
        double circleArea;
        
        circleArea = PI * radius * radius; 
        return (circleArea);
    }
    
    public double getRadius(){
        return(radius);
    }
    public double circleCircumfrence(){
        double circleCircumfrence;
        
        circleCircumfrence = 2 *PI * radius;
        return (circleCircumfrence);
    }
    public void displayAreaFormula(){
        System.out.println("This is the area formula: " + PI + " * " + radius + " * " + radius);
    }
    
    public boolean equals(Object c){
        Circle testObj = (Circle)c;
        
        if(testObj.getRadius() == radius){
            return(true);
        } else {
            return(false);
        }
    }
    public String toString(){
        String circleString;
        circleString = "Circle radius has a radius of " + radius;
        return(circleString);
    } 
    
}
