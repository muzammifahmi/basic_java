package Conditions;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.println("masukkan angka pertama : ");
        number1 = scanner.nextInt();
        System.out.println("masukkan angka kedua : ");
        number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Number 1 is greater than number 2");
        } else if(number1 < number2) {
            System.out.println("Number 1 is less than number 2");
        } else {
            System.out.println("Number 1 and number 2 are equal");
        }
        scanner.close();
    }
}
