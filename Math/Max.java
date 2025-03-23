package Math;

public class Max{
    public static void main(String[] args) {
        int number1 = 23;
        int number2 = 45;
        int number3 = 78;

        int number4 = Math.max(number1, number2);
        int number5 = Math.max(number4, number3);
        int number6 = Math.max(number5, number2);

        System.out.println(number6);
    }
}