/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan Cetak Nama
 */

public class PBO210117067Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama ===");
        System.out.println("Masukkan Nama Anda : ");
        ptr.setNama(baca.nextLine());
        System.out.println("Mau Cetak Berapa Kali? : ");
        ptr.setJmlCetak(baca.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
