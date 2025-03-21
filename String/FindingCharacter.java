package String;

public class FindingCharacter {
    public static void main(String[] args) {
        String str = "cari kata fahmi dari kata saya fahmi";
        //searches for the first character of the word
        //Java counts positions from zero.
        System.out.println("IMPLEMENTASI METHOD indexOf()");
        System.out.println("=====================================");
        System.out.println(str);
        System.out.println(str.indexOf("fahmi"));
    }
}
