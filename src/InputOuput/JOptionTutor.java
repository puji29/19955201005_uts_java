/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOuput;

import javax.swing.JOptionPane;

/**
 *
 * @author puji
 */
public class JOptionTutor {
    public static void main(String[] args) {
            String nama;
        int angka1;
        nama =  JOptionPane.showInputDialog("MASUAKAN NAMA");
        angka1 = Integer.parseInt(JOptionPane.showInputDialog("masukan umur"));
        
        System.out.println("nama saya = "+nama);
        System.out.println("umur saya = "+angka1);
        
    }
}
