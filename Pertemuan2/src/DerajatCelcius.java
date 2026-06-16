/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DerajatCelcius;
import java.util.Scanner;
/**
 *
 * @author tania
 */

    /**
     * @param args the command line arguments
     */
    

public class DerajatCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Derajat Celcius : ");
        double celcius = input.nextDouble();

        double fahrenheit = (9.0/5.0) * celcius + 32;
        double reamur = (4.0/5.0) * celcius;

        System.out.println("Hasil Konversi");
        System.out.println("Derajat Fahrenheit : " + fahrenheit);
        System.out.println("Derajat Reamur     : " + reamur);
    }
}
   