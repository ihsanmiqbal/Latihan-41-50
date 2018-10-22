/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * menghitung umur
 */
public class PBO210117067Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Age man1 = new Age(2018);
        System.out.println("Masukkan Tahun Lahir : ");
        man1.setYearBirth(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : "+man1.getYearBirth());
        System.out.println("Hari Ini Tahun : "+man1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : "+man1.hitungUmur()+ " Tahun");
        man1.tandanyaKamu((man1.hitungUmur()));
    }
    
}