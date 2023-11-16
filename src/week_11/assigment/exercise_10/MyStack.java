package week_11.assigment.exercise_10;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack extends ArrayList<Object> {


    public MyStack() {

    }


    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }


    public Object pop() {

        return super.remove(super.size() - 1);
    }




    public void push ( Object o){
        super.add(o);
    }

    @Override
    public String toString() {
        return "Stack :" +  super.toString();
    }
}
