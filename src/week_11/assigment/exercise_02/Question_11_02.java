package week_11.assigment.exercise_02;

import week_10.assignment.exercise_14.MyDate;
import java.util.Date ;

public class Question_11_02 {
    public static void main(String[] args) {

        System.out.println("\n-----PERSON-----");
        Person person = new Person("Gurol", "Istanbul", "999999999", "gurolinar@gmail.com");
        System.out.println(person);

        System.out.println("\n------STUDENT----");
        Student student = new Student("Nafiz", "Ankara", "33333333", "nafiz0@gmail.com", 0);
        System.out.println(student);


        System.out.println("\n------EMPLOYEE----");
        Employee employee = new Employee("Recai", " Istanbul", "666666", "recai21@gmail.com", 910, 60000.0, new MyDate());
        System.out.println(employee);


        System.out.println("\n------FACULTY----");
        Faculty faculty = new Faculty("Serhat", "Dallas", "41333333", "serhat.inar@gmail.com", 101, 5000.0, new MyDate(), "10am to o6 pm", "manager");
        System.out.println(faculty);


        System.out.println("\n------STAFF----");
        Staff staff = new Staff("Mehmet", "Diyarbakir", "77777777", "3007toprak@gmail.com", 777, 777777.7, new MyDate(), "Ceo");
        System.out.println(staff);



    }
}
