/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        Segitiga st = new Segitiga();

        System.out.println("1. Sudut = 180 - sudutA : " + st.totalSudut(90));
        System.out.println("2. Sudut = 180 - (sudutA + sudutB): " + st.totalSudut(90, 60));
        System.out.println("3. Keliling = sisiA + sisiB + sisiC : " + st.keliling(5, 15 , 30));
        System.out.println("4. C : " + st.keliling(5, 4));
    }
}
