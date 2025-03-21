package DataType;
public class DataTypesExample {
    public static void main(String[] args) {
        int items = 100;
        float costPerItem = 1.25f;
        float totalCost = items * costPerItem;
        char currency = '$';
        //print
        System.out.println("PROGRAM DATA BARANG");
        System.out.println("Jumlah Barang : " + items);
        System.out.println("Harga tiap Barang : " + costPerItem + currency);
        System.out.println("Total Harga : " + totalCost + currency);
    }
}
