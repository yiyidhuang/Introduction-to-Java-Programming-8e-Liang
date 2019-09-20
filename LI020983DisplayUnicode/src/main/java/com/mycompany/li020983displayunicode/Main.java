/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.li020983displayunicode;
import javax.swing.JOptionPane;
/**
 *
 * @author newTodd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, 
                "\u6B22\u8FCE \u03b1 \u03b2 \u03b3",
                "u6B22\u8FCE Welcome",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
