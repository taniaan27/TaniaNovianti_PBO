import java.util.Scanner;

public class UTS_no1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ulang;

        do {

            char jk;
            int tinggi, berat, ideal, selisih;

            // input jenis kelamin
            System.out.print("Pilih jenis kelamin (L/P) : ");
            jk = input.next().charAt(0);

            // input tinggi badan
            System.out.print("Masukkan tinggi badan : ");
            tinggi = input.nextInt();

            // menghitung berat badan ideal
            if (jk == 'L' || jk == 'l') {
                ideal = tinggi - 100;
            } else {
                ideal = tinggi - 110;
            }

            System.out.println("Berat badan ideal : " + ideal + " Kg");

            // input berat badan
            System.out.print("Masukkan berat badan : ");
            berat = input.nextInt();

            selisih = berat - ideal;

            // menentukan kategori
            if (berat <= ideal) {

                selisih = ideal - berat;

                System.out.println("Kategori : Kurus");
                System.out.println("Harus menambah berat badan "
                        + selisih + " Kg");

            } else {

                System.out.println("Kategori : Gemuk");
                System.out.println("Harus mengurangi berat badan "
                        + selisih + " Kg");
            }

            // ulang program
            System.out.print("\nUlang program? (ya/tidak) : ");
            ulang = input.next();

            System.out.println();

        } while (ulang.equalsIgnoreCase("ya"));

    }
}