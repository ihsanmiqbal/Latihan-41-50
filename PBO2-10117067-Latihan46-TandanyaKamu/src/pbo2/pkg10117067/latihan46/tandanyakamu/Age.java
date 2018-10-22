/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan46.tandanyakamu;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * menghitung umur
 */
public class Age {

    
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {

        if (umur >= 0 && umur <= 5) {
            System.out.println("Tandanya kamu "+red + "Lagi lucu - lucunya");
        } else if (umur > 5 && umur <= 10) {
            System.out.println("Tandanya kamu "+red + "Masih Anak - Anak");
        } 
        else if (umur > 10 && umur <= 13) {
            System.out.println("Tandanya kamu "+red + "Masih Remadja");
        } 
        else if (umur > 13 && umur <= 19) {
            System.out.println("Tandanya kamu "+red + "4lAy");
        } 
        else if (umur > 19 && umur <= 29) {
            System.out.println("Tandanya kamu "+red + "Lagi Galau Nyari Jodoh");
        } 
        else if (umur > 29 && umur <= 35) {
            System.out.println("Tandanya kamu "+red + "Lagi Sibuk Nyari Uang");
        } 
        else if (umur > 35 && umur <= 150) {
            System.out.println("Tandanya kamu "+red + "Sudah Tua");
        } 
        else if (umur < 0 || umur > 150) {
                System.out.println("Tandanya kamu "+red + "Tidak Terdeteksi diKehidupan");
        } 
        return red;
    }
}
