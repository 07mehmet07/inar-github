package week_05.assigment;

public class Question_33 {
    public static void main(String[] args) {


        System.out.println("Perfect numbers are :");

        for (int i = 1 ; i <= 10000 ; i++){
            int sum = 0;

            for (int m =1 ; m < i ; m++ ){

                if (i % m == 0){
                    sum += m ;
                }
            }
       if (sum == i){
           System.out.println(i);
       }




        }









    }
}
