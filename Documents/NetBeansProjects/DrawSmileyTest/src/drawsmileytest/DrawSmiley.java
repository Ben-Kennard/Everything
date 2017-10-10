/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawsmileytest;

/**
 *
 * @author beken8519
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
/**
 *
 * @author rkaune
 */
public class DrawSmiley extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Random rand = new Random();
      int red = rand.nextInt(255) + 1;
      int green = rand.nextInt(255) + 1;
      int blue = rand.nextInt(255) + 1;
      // draw the face
      g.setColor(new Color(red,green,blue));//first
      g.fillOval(10, 10, 200, 200);
      g.setColor(new Color(green,blue,red));//second
      g.fillOval(30, 30, 160, 160);
      g.setColor(new Color(red,green,blue));//third
      g.fillOval(50, 50, 120, 120);
       g.setColor(new Color(green,blue,red));//fourth
      g.fillOval(70, 70, 80, 80);
      g.setColor(new Color(red,green,blue));//fifth
      g.fillOval(90, 90, 40, 40);
   } 
} // end class DrawSmiley