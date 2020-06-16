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
public class SwitchCase {
    public static void main(String[] args) {
          String input;
        
        Scanner inputUser = new Scanner(System.in);
       
        
        System.out.print("masukan angka :");
        input = inputUser.next();
        
        switch(input){
           case "1":
                System.out.println("satu");
                break;
            case "2":
                System.out.println("dua");
                break;
            case "3":
                System.out.println("tiga");
                break;
            case "4":
                System.out.println("empat");
                break;
            case "5":
                System.out.println("lima");
                break;
            default:
                System.out.println("yang anda masukan bukan angk atau lebih dari satu angka");
                break;
       }
        System.out.println("program selesai");
    }
}
