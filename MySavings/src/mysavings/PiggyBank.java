/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysavings;
import java.util.Scanner;
/**
 *
 * @author beken8519
 */
public class PiggyBank {
    private double balance;
    private double  penny = .01;
    private double nickel = .05;
    private double dime = .1;
    private double quarter = .25;
    Scanner input = new Scanner(System.in);
    PiggyBank(){
        
    }
    
    public double showBalance(){
        return(balance);
    }
    
    public double addChange(){ 
        
        if(input.nextInt() == 1){
            balance = balance + penny;
        } else if (input.nextInt() == 2) {
            input.close();
            balance = balance + nickel;
        } else if (input.nextInt() == 3){
            input.close();
            balance = balance + dime;
        } else if(input.nextInt() == 4){
            input.close();
            balance = balance + quarter;
        }
        return(balance);
    }
    
    public double removeChange(){       
        if(input.nextInt() == 1){
            input.close();
            balance = balance - penny;
        } else if (input.nextInt() == 2) {
            input.close();
            balance = balance - nickel;
        } else if (input.nextInt() == 3){
            input.close();
            balance = balance - dime;
        } else if(input.nextInt() == 4){
            input.close();
            balance = balance - quarter;
        }
        return(balance);
    }
}
