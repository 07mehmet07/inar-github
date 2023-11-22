package week_12.assigment.exercise_05;

import week_11.assigment.exercise_01.Triangle;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("It is illegal triangle !!");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}