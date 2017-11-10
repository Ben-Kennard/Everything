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
public class Faculty extends UEmployee{
    private String departmentName;
    private String employeeName;
    private double employeeSalary;
   /**
   * Constructor
   * pre: none
   * post: a faculty object is created.
   */
    Faculty(String tempDepartmentName,String employeeName2,int employeeSalary2){
        super(employeeName2, employeeSalary2);
        departmentName = tempDepartmentName;
        employeeName = employeeName2;
        employeeSalary = employeeSalary2;
    }
    /**
    Returns the name of the department.
    pre: none
    post: The name of the department is returned 
    */
    public String getDepartmentName(){
        return(departmentName);
    }
    
    /**
    Returns a string that returns the employee name, salary and department name.
    pre: none 
    post: a string representing the employee name, salary and department name.
    */
    public String toString(){
    return("The employees name is: " + employeeName + "\n" + "The salary is: "+ employeeSalary+
            "\n"+"and their department name is: " + departmentName);
}    
}
