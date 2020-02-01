/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Metodos {        
       public static void comprobar(){           
        char[] letraDni = 
        {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };  
        
            int miDNI =Integer.parseInt(JOptionPane.showInputDialog(null, "DNI"));                
            int resto=miDNI % 23;                   
        System.out.println("Mi letra "+ letraDni[resto]);
       }
}
