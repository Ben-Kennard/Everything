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
public class MySavings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PiggyBank bank1 = new PiggyBank();
        Scanner input = new Scanner(System.in);
        System.out.println("1. shows the piggy banks balance");
        System.out.println("2. adds change to the piggy bank");
        System.out.println("3. removes change from the piggy bank");
        
        if(input.nextInt() == 1){
            input.close();
            System.out.println(bank1.showBalance());
        } else if(input.nextInt() == 2){
            input.close();
        bank1.addChange();
        } else if(input.nextInt() == 3){
            input.close();
            bank1.removeChange();
        }
        
    }
    
}
