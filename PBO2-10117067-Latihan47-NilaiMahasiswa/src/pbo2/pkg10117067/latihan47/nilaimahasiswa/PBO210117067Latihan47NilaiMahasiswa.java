/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan47.nilaimahasiswa;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S 
 * Kelas : PBO2 
 * Nim : 10117067
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai akhir 
 * dan indeks nilai mahasiswa
 */
public class PBO210117067Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Nilai mahasiswa = new Nilai(75,45,34);
        System.out.println("QUIZ : "+mahasiswa.getnQuiz());
        System.out.println("UTS : "+mahasiswa.getnUTS());
        System.out.println("UAS : "+mahasiswa.getnUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa.indeksKeterangan(mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir())));
        System.out.println("");
        //
        Nilai mahasiswa2 = new Nilai(60,80,75);
        System.out.println("QUIZ : "+mahasiswa2.getnQuiz());
        System.out.println("UTS : "+mahasiswa2.getnUTS());
        System.out.println("UAS : "+mahasiswa2.getnUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa2.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa2.indeksKeterangan(mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir())));
        System.out.println("");
        //
        Nilai mahasiswa3 = new Nilai(30,80,40);
        System.out.println("QUIZ : "+mahasiswa3.getnQuiz());
        System.out.println("UTS : "+mahasiswa3.getnUTS());
        System.out.println("UAS : "+mahasiswa3.getnUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa3.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa3.indeksKeterangan(mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir())));
    }
    
}
