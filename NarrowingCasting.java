public class NarrowingCasting {
   public static void main(String[] args){
    //implementasi narrowing casting
    double numberDouble = 9.88f;
    int numberInteger = (int)numberDouble;

    System.out.println("Angka bertipe data double : " + numberDouble);
    System.out.println("Angka Integer yang dirubah dari tipe data double : " + numberInteger + "\n");

    int maxScore = 900;
    int userScore = 567;

    float precentace =  (float) userScore / maxScore * 100.0f;
    System.out.println("Presentasi Skor Peserta : " + precentace);

   }
}
