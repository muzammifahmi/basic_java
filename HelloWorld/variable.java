package HelloWorld;
public class variable {
    public static void main(String[] args) {
        //display variable
        String name = "Fahmi";
        System.out.println("Nama : " + name + "\n");

        String firstName = "Achmad ";
        String lastName = "Muzammi Fahmi";
        int studentID = 23092330;
        int studentAge = 20;
        float studentFee = 1000.50f;
        char studentGrade = 'A';
        System.out.println("PROGRAM DATA MAHASISWA");
        System.out.println("Nama Lengkap : " + firstName + lastName);
        System.out.println("NIM          : " + studentID);
        System.out.println("Umur         : " + studentAge);
        System.out.println("Biaya Kuliah : " + studentFee);
        System.out.println("Grade        : " + studentGrade + "\n");

        int firstNumber = 30;
        int secondNumber = 20;
        System.out.println("PENJUMLAHAN DAN PENGURANGAN 2 ANGKA");
        System.out.println("hasil penjumlahan dari " + firstNumber + " + " + secondNumber + " adalah : " + (firstNumber + secondNumber));
        System.out.println("hasil pengurangan dari " + firstNumber + " - " + secondNumber + " adalah : " + (firstNumber - secondNumber)+ "\n");

        int angkaPertama = 20, angkaKedua = 10, angkaKetiga = 40;
        System.out.println("PENJUMLAHAN DAN PENGURANGAN 3 ANGKA");
        System.out.println("hasil penjumlahan dari " + angkaPertama + " + " + angkaKedua + " + " + angkaKetiga + " adalah : " + (angkaPertama + angkaKedua + angkaKetiga));
        System.out.println("hasil pengurangan dari " + angkaPertama + " - " + angkaKedua + " - " + angkaKetiga + " adalah : " + (angkaPertama - angkaKedua - angkaKetiga) + "\n"); 

        //penerapan variable untuk membuat program luas persegi panjang
        int length = 10, width = 5, area;
        //rumus luas persegi panjang
        area = length * width;
        //print hasil luas persegi panjang
        System.out.println("PROGRAM LUAS PERSEGI PANJANG");
        System.out.println("Panjang              : " + length);
        System.out.println("Lebar                : " + width);
        System.out.println("Luas persegi panjang : " + area + "\n");
    }
}
