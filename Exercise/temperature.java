package Exercise;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celcius, farenheit, reamur, kelvin;

        System.out.println("=====================");
        System.out.println("KONVERSI SUHU SELCIUS");
        System.out.println("=====================");
        System.out.println("Masukkan Suhu dalam Celcius : ");
        celcius = scanner.nextDouble();

        farenheit = 9 / 5 * celcius + 32;
        reamur = 4 / 5 * celcius;
        kelvin = celcius + 273;

        System.out.println("HASIL KONVERSI SUHU");
        System.out.println("Celcius   : " + celcius);
        System.out.println("Farenheit : " + farenheit);
        System.out.println("Reamur    : " + reamur);
        System.out.println("Kelvin    : " + kelvin);
        scanner.close();
    }
}
