package week_10.assignment.Exercise_02;

public class Question_02 {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Martin", 28, 177, 77);

        BMI bmi2 = new BMI("Adam Smith", 182, 101);



        System.out.println("name:" + bmi1.getName());
        System.out.print("Bmi:" + bmi1.getBMI());
        System.out.print("\tstatus:" + bmi1.getStatus());


        System.out.println("\nname:" + bmi2.getName());
        System.out.print("Bmi:" + bmi2.getBMI());
        System.out.print("\tstatus:" + bmi2.getStatus());


    }
}
