/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprites;

import Middle_age.*;
import Oldd_age.*;
import javax.swing.*;
import java.awt.Graphics;


/**
 *
 * @author JAVIER
 */
public class Sprites extends JFrame
{
    
    public Sprites(){
        add(new Fond());
        add(new Wizard_enemy());
        add(new Warrior());
    }
  
    public static void main(String[] args) {
        Sprites frame = new Sprites();
        frame.setTitle("Game Memory");
        frame.setSize(1100, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
     
    
    
}
