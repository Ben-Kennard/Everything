/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package university;

/**
 *
 * @author beken8519
 */
public abstract class UEmployee {
    private String employeeName;
    private double employeeSalary;
    /**
    Constructor
    */
    UEmployee(String tempEmployeeName, int tempEmployeeSalary){
        employeeName = tempEmployeeName;
        employeeSalary = tempEmployeeSalary;
    }
    
    //This is used in all classes so that they have to have a toString
    public abstract String toString();
        
    
}
