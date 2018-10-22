/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * tabungan
 */
public class PBO210117067Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah;
        
        Scanner baca = new Scanner(System.in);
        System.out.println("=== Program Penarikan Uang ===");
        System.out.println("Masukkan Saldo Awal : ");
        Tabungan tbg = new Tabungan(baca.nextInt());
        System.out.println("Jumlah uang yang diambil : ");
        jumlah = baca.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
    }
    
}
