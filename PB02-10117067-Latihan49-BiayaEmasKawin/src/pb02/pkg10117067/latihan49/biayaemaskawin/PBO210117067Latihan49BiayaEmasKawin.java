/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117067.latihan49.biayaemaskawin;

import pb02.pkg10117067.latihan49.biayaemaskawin.Emas;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas
 * kawin
 */
public class PBO210117067Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas = new Emas(15.7);
        System.out.println("Hitung Mahar Nikah");  
        System.out.println("Harga Emas Saat ini Rp. "+emas.getHarga()+" per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : "+emas.getBerat()+" gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. "+emas.hitungHargaEmas(emas.getBerat(), emas.getHarga()));
    }
    
}
