/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOuput;

/**
 *
 * @author puji
 */
public class Scanner {
    public static void main(String[] args) {
     String nama, alamat;
        int usia, gaji;

        // membuat scanner baru
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pegawai swalayan ###");
        System.out.print("Nama pegawai : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat : ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia : ");
        usia = keyboard.nextInt();

        System.out.print("Gaji : ");
        gaji = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama pegawai: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
    }
}
