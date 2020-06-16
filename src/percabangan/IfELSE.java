/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author puji
 */
public class IfELSE {
    public static void main(String[] args) {
         String kartu;
    int belanja, bayar, diskon;
    Scanner baca=new Scanner(System.in);
    System.out.print("Apakah ada kartu member = ");
    kartu=baca.nextLine();
    System.out.print("Total Belanja=");
    belanja=baca.nextInt();
    if(kartu.equalsIgnoreCase("ya")){
    if(belanja >=500000){
            diskon=50000;
    } else if(belanja>=100000){
            diskon=15000;
    }else {
            diskon=0;
    }
    } else {
    if(belanja>=100000){
            diskon=5000;
    }else {
            diskon=0;
    }
    }
    bayar=belanja-diskon;
    System.out.println("Total bayar=Rp. "+bayar);
    }
}
