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
public class Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    public void setNoteProject(String note){
        System.out.println("This Project Show you how to manage method in Java");
    }
    
    public double add(double val1, double val2){
        return value1+value2;
    }
    public double minus(double val1, double val2){
        return value1-value2;
    }
    public double multiplication(double val1, double val2){
        return value1*value2;
    }
    public double division(double val1, double val2){
        return value1/value2;
    }
}
