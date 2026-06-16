/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaiSiswa;
import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nama Siswa   : ");
        String nama = sc.nextLine();

        System.out.print("Nilai UTS            : ");
        double uts = sc.nextDouble();

        System.out.print("Nilai UAS            : ");
        double uas = sc.nextDouble();

        System.out.print("Nilai Tugas Mandiri  : ");
        double tugasMandiri = sc.nextDouble();

        // Hitung Nilai Murni
        double murniUTS   = uts * 35.0 / 100.0;
        double murniUAS   = uas * 45.0 / 100.0;
        double murniTugas = tugasMandiri * 20.0 / 100.0;

        // Nilai Akhir
        double nilaiAkhir = murniUTS + murniUAS + murniTugas;

        System.out.println("\nNilai Murni yang diperoleh :");
        System.out.printf("Nilai Murni UTS   : %.2f%n", murniUTS);
        System.out.printf("Nilai Murni UAS   : %.2f%n", murniUAS);
        System.out.printf("Nilai Murni Tugas : %.2f%n", murniTugas);
        System.out.printf("Nilai Akhir yang diperoleh yaitu : %.2f%n", nilaiAkhir);

        sc.close();
    }
}
