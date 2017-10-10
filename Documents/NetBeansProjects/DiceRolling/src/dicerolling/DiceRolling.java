/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicerolling;
import java.util.Random;
/**
 *
 * @author beken8519
 */
public class DiceRolling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] diceCombo = new int[18000000];
        int[] frequency = new int [12];
        int dice1 =0;
        int dice2=0;
        Random rand = new Random();
        Random rand2 = new Random();
        
        for(int counter= 0; counter < diceCombo.length;counter++){
            dice1 = rand.nextInt(6)+1;
            dice2 = rand2.nextInt(6)+1;
        }
    }
    
}
