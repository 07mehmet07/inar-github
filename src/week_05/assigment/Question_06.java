package week_05.assigment;

public class Question_06 {
    public static void main(String[] args) {
final double rate = 1.609 ;
        System.out.println("Miles          Kilometers     |    Kilometers               Miles");


        for (int i = 1, k= 20 ; i<11 && k<66;  i++ , k+=5 ){

            System.out.printf("%-15d%6.3f%14s" , i , i * rate , "|    ");
            System.out.printf("%-25d%6.3f%10s" , k , k/rate , "           ");
            System.out.println();

        }

    }
}
