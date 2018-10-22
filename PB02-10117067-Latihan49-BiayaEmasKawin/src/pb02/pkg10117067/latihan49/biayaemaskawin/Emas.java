/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117067.latihan49.biayaemaskawin;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal 
 * Kelas : PBO2 
 * Nim : 10117067
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas
 * kawin
 */
public class Emas {
    private double harga = 570000;
    private double berat;
    
    public Emas(double berat){
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungHargaEmas(double parBerat, double parHarga){
        return berat*harga;
    }
    
}


