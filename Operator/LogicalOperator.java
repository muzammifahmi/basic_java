package Operator;
public class LogicalOperator {
    public static void main(String[] args) {
        //implementasi operator logika
        int number1 = 38;
        
        System.out.println("LOGICAL OPERATORS");
        // && operator logika AND
        System.out.println(number1 + " < 50 && " + number1 + " > 30 : " + (number1 < 50 && number1 > 30));
        // || operator logika OR
        System.out.println(number1 + " < 50 || " + number1 + " > 30 : " + (number1 < 50 || number1 > 30));
        // ! operator logika NOT
        System.out.println("!" + number1 + " < 50 : " + !(number1 < 50));
    }
}
