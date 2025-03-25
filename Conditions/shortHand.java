package Conditions;

import java.util.Scanner;

public class shortHand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.println("Masukkan angka pertama :");
        number1 = scanner.nextInt();
        System.out.println("Masukkan angka kedua :");
        number2 = scanner.nextInt();

        String result = (number1 > number2) ? "number 1 is greater than number 2" : (number1 < number2) ? "number 1 is less than number 2" : "number 1 and number 2 are equal";
        System.out.println(result);
        scanner.close();
    }
}
