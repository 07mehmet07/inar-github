package week_06.assigment;

public class Question_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\t\tCommission");
        System.out.println("-----------------------------------");

for (int i = 10000 ; i <= 100000 ; i += 5000){
    System.out.println(i + "\t\t\t\t\t" + computeComission(i));
}}



public static double computeComission (int i) {

        double comission ;

    if(i<5001){
        comission=i/100.0*8.0;
    }
    else if(i<10001){
        comission=(5000.0/100*8) +(i-5000)/100.0*10 ;
    }
    else{
        comission=(5000.0/100*8) +(10000-5000)/100.0*10 + (i-10000)/100.0*12;
    }
    return comission;


}







    }
