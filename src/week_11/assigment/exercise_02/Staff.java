package week_11.assigment.exercise_02;


import week_10.assignment.exercise_14.MyDate;

public class Staff extends Employee {
    private String title;


    public Staff(String name, String address, String phoneNumber, String emailAddress, int office, double salary, MyDate hiredDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntitle: '" + title + '\'';
    }
}
