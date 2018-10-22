/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan43.gajipegawai;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S
 * Kelas : PBO2 
 * Nim : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
 * Gaji Pegawai
 */
public class PBO210117067Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("---------------------");
        GajiPegawai pgw = new GajiPegawai();
        pgw.setNama("Ihsan Muhammad Iqbal");
        pgw.setAlamat("Griya Utama Rancaekek");
        pgw.setUangTransport(250000);
        pgw.setUangTunjangan(300000);
        pgw.setGajiPokok(4500000);
        pgw.setTotalGaji(pgw.getTotalGaji());
        pgw.tampilData(pgw.getNama(), pgw.getAlamat(), pgw.getUangTunjangan(), pgw.getUangTransport(), pgw.getGajiPokok(), pgw.getTotalGaji());
    }
    
}
