package Operator;
public class operator {
    public static void main(String[] args) {
        //operator
        //arithmatic operator

        //number for arithmatic operator (1)
        int numberInteger1 = 625;
        int numberInteger2 = 25;
        //number for arithmatic operator (2)
        int numberInteger3 = 350;
        int numberInteger4 = 85;

        System.out.println("OPERATOR ARITHMATIC (1)");
        System.out.println("Angka Pertama : " + numberInteger1);
        System.out.println("Angka Kedua   : " + numberInteger2);
        System.out.println("=====================================");
        System.out.println("Penjumlahan " + numberInteger1 + " + " + numberInteger2 + " = " + (numberInteger1 + numberInteger2));
        System.out.println("Pengurangan " + numberInteger1 + " - " + numberInteger2 + " = " + (numberInteger1 - numberInteger2));
        System.out.println("Perkalian " + numberInteger1 + " * " + numberInteger2 + " = " + (numberInteger1 * numberInteger2));
        System.out.println("Pembagian " + numberInteger1 + " / " + numberInteger2 + " = " + (numberInteger1 / numberInteger2) + "\n");

        System.out.println("OPERATOR ARITHMATIC (2)");
        System.out.println("Angka Pertama : " + numberInteger3);
        System.out.println("Angka Kedua   : " + numberInteger4);
        System.out.println("=====================================");
        System.out.println("Modulus " + numberInteger3 + " & " + numberInteger4 + " = " + (numberInteger3 % numberInteger4));

        ++numberInteger3; //increment
        System.out.println("Increment        = " + numberInteger3);

        --numberInteger4; //decrement
        System.out.println("Decrement        = " + numberInteger4 + "\n");
    }
}
