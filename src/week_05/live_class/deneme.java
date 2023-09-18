package week_05.live_class;

public class deneme {
    public static void main(String[] args) {
        int numRows = 10; // İstediğiniz satır sayısını burada ayarlayabilirsiniz.

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   "); // Boşlukları düzenlemek için
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}
