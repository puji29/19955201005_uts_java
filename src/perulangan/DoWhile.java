/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author puji
 */
public class DoWhile {
    public static void main(String[] args) {
          int pilihan;
        
        Scanner masukan = new Scanner(System.in);
        do{
            System.out.println("pilihan menu berikut :");
            System.out.println("t1.Cetak");
            System.out.println("t2.Lihat");
            System.out.println("t3.Keluar");
            System.out.print("pilihan anda :");
            
            pilihan = masukan.nextInt();
            
            if(pilihan==1){
                
                System.out.println("Cetak Laporan. Siapkan Printer");
               
            }else if(pilihan==2){
                
                System.out.println("Tampilkan Laporan");
            }
        }while(pilihan!=3);
    }
}
