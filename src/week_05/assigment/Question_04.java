package week_05.assigment;

public class Question_04 {
    public static void main(String[] args) {
        final double rate = 1.609;
        System.out.println("Miles          Kilometers");

        for (int i = 1; i<11 ; i++){
            System.out.printf("%-16d %.3f" , i , i  * rate);
            System.out.println();
        }




    }
}
