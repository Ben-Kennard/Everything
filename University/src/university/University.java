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
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UEmployee person1 = new Staff("Professor","Dave",75000);
        UEmployee person2 = new Faculty("Math","Dave",75000);
        
        System.out.println(person1);
        System.out.println(person2);
    }
    
}
