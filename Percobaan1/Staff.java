/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author HP
 */
public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
     public int getLembur() {
        return lembur;
    }
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    public double getGajiLembur(){
        return gajiLembur;
    }

    public double getmGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    public double getmGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }


    public void lihatInfo() {
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.println("Jml Lembur : " + this.getLembur());
        System.out.printf("Gaji Lembur : Rp %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji : Rp %.0f\n\n", this.getGaji());
    }
}
