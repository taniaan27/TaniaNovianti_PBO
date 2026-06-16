/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaiRadius;
import java.util.Scanner;

public class NilaiRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Radius : ");
        double r = input.nextDouble();

        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;

        System.out.println("Hasil Perhitungan");
        System.out.println("Luas Lingkaran     : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}


