import java.util.Scanner;

public class UTS_no2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ulang;

        do {

            System.out.println("PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA");
            System.out.print("Masukkan Jumlah Mahasiswa : ");
            int jumlah = input.nextInt();

            // array untuk menyimpan data
            String nama[] = new String[jumlah];
            double tugas[] = new double[jumlah];
            double uts[] = new double[jumlah];
            double uas[] = new double[jumlah];
            double akhir[] = new double[jumlah];
            String grade[] = new String[jumlah];

            // input data mahasiswa
            for (int i = 0; i < jumlah; i++) {

                input.nextLine();

                System.out.println("\nMahasiswa Ke - " + (i + 1));

                System.out.print("Nama Mahasiswa : ");
                nama[i] = input.nextLine();

                System.out.print("Nilai Tugas : ");
                tugas[i] = input.nextDouble();

                System.out.print("Nilai UTS : ");
                uts[i] = input.nextDouble();

                System.out.print("Nilai UAS : ");
                uas[i] = input.nextDouble();

                // proses hitung nilai akhir
                akhir[i] = (tugas[i] * 0.30) + (uts[i] * 0.30) + (uas[i] * 0.40);

                // menentukan grade
                if (akhir[i] >= 80) {
                    grade[i] = "A";
                } else if (akhir[i] >= 70) {
                    grade[i] = "B";
                } else if (akhir[i] >= 59) {
                    grade[i] = "C";
                } else if (akhir[i] >= 50) {
                    grade[i] = "D";
                } else {
                    grade[i] = "E";
                }
            }

            // tampilan output
            System.out.println("\nDAFTAR NILAI");
            System.out.println("MATERI : PEMROGRAMMAN PBO");
            System.out.println("-------------------------------------------------------------");
            System.out.println("No\tNama\tTugas\tUTS\tUAS\tAkhir\tGrade");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < jumlah; i++) {

                System.out.println((i + 1) + "\t" +
                        nama[i] + "\t" +
                        tugas[i] + "\t" +
                        uts[i] + "\t" +
                        uas[i] + "\t" +
                        akhir[i] + "\t" +
                        grade[i]);
            }

            System.out.println("-------------------------------------------------------------");

            System.out.print("\nIngin mengulang program? (ya/tidak) : ");
            input.nextLine();
            ulang = input.nextLine();

            System.out.println();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Program selesai");

    }
}