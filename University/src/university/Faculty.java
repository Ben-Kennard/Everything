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
    Faculty(String tempDepartmentName,String employeeName2,int employeeSalary2){
        super(employeeName2, employeeSalary2);
        departmentName = tempDepartmentName;
        employeeName = employeeName2;
        employeeSalary = employeeSalary2;
    }
    
    public String getDepartmentName(){
        return(departmentName);
    }
    public String toString(){
    return("The employees name is: " + employeeName + "\n" + "The salary is: "+ employeeSalary+
            "\n"+"and their department name is: " + departmentName);
}    
}
