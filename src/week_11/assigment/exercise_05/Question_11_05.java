package week_11.assigment.exercise_05;

public class Question_11_05 {
    public static void main(String[] args) {

        Course course = new Course("java");

        course.addStudent("Nisanur Altuntas");
        course.addStudent("Gürkan SERTESER");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Denis");
        course.addStudent("Berkan Eris");

        System.out.println("\nAfter adding student to the course..");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents().get(i) + " - ");

        }

        System.out.println("\nNumber of students: " + course.getNumberOfStudents() + "\n----------------------");

        course.dropStudent("Sinan Cetin");
        course.dropStudent("Mehmet Toprak");
        course.dropStudent("Berkan Eris");

        System.out.println("After dropping student from the course..");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents().get(i) + " - ");

        }
        System.out.println("\nNumber of students: " + course.getNumberOfStudents());


    }
}
