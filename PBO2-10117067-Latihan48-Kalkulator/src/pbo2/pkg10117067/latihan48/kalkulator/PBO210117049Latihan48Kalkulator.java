/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan48.kalkulator;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan Muhammad Iqbal S 
 * Kelas : PBO2 
 * Nim : 10117067
 * Deskripsi Program : Program ini berisi program untuk menghitung angka dengan
 * operator Tambah, Kurang, Kali, dan Bagi
 */
public class PBO210117049Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator klt =  new Kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("VALUE 1 = "+klt.getValue1());
        System.out.println("VALUE 2 = "+klt.getValue2());
        klt.setNameProject();
        klt.setNoteProject(null);
        System.out.println("Result Add is = "+klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiplication is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}
