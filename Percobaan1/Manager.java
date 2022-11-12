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
public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan){
        this.tunjangan=tunjangan;
    }
    public double getTunjangan(){
        return tunjangan;
    }

    public void setBagian(String bagian){
        this.bagian=bagian;
    }
    public String getBagian(){
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st=st;
    }

    public void viewStaff() {
        System.out.println("===============");
        for (int i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("===============");
    }

    public void lihatInfo() {
        System.out.println("Manager : " + this.getBagian());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.printf("Tunjangan : Rp %.0f\n", this.getTunjangan());
        System.out.printf("Gaji : Rp %.0f\n", this.getGaji());
        System.out.println("Bagian : " + this.getBagian());
        this.viewStaff();
    }

    
    public Double getmGajiSultan() {
        return super.getGaji() + tunjangan;
    }
}
