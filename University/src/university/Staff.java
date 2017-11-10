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
public class Staff extends UEmployee{
    private String jobTitle;
    private String employeeName;
    private double employeeSalary;
   /**
   Constructor
   pre: none
   post: a staff obect is created 
   */
    
    Staff(String tempJobTitle,String employeeName1,int employeeSalary1){
        super(employeeName1,employeeSalary1);
        jobTitle = tempJobTitle;
        employeeName = employeeName1;
        employeeSalary = employeeSalary1;
    }
    /**
    Returns the job title 
    pre: none 
    post: the job title
    */
    public String getJobTitle(){
        return(jobTitle);
    }
    
    /**
    Returns a string that represents the employee name, salary and job title
    pre: none 
    post: a string representing the employee name, salary and job title is returned 
    */
public String toString(){
    return("The employees name is: " + employeeName + "\n" + "The salary is "+ employeeSalary+
            "\n"+"and their title is: " + jobTitle);
}    

}
