package Exercise;
import java.util.Scanner;
public class PersonalData {
    public static void main(String[] args) {
        int year;
        String nim, name, faculty, studyProgram;

        Scanner scanner = new Scanner(System.in);
        //implementasi input data
        System.out.println("INPUT DATA MAHASISWA");
        System.out.println("Masukkan Nama : ");
        name = scanner.nextLine();
        System.out.println("Masukkan NIM : ");
        nim = scanner.nextLine();
        System.out.println("Masukkan Tahun Lahir : ");
        year = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        System.out.println("Masukkan Fakultas : ");
        faculty = scanner.nextLine();
        System.out.println("Masukkan Program Studi : ");
        studyProgram = scanner.nextLine();

        System.out.println("====================================");
        System.out.println("Mahasiswa dengan nama " + name + " dan NIM " 
        + nim + "\n Yang lahir pada tahun " + year + " adalah Mahasiswa Fakultas " 
        + faculty + " dan Program Studi " + studyProgram);
        System.out.println("====================================");
        scanner.close();    
    }
}
