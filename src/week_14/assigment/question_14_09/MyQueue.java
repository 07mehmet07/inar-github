package week_14.assigment.question_14_09;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> mainStack;
    private Stack<Integer> tempStack;


    public MyQueue() {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public Stack<Integer> getMainStack() {
        return mainStack;
    }

    public void setMainStack(Stack<Integer> mainStack) {
        this.mainStack = mainStack;
    }

    public Stack<Integer> getTempStack() {
        return tempStack;
    }

    public void setTempStack(Stack<Integer> tempStack) {
        this.tempStack = tempStack;
    }

    public void push(int x) {
        mainStack.add(x);
    }

    public int pop() {
        if (tempStack.isEmpty()) {
            while (!mainStack.isEmpty()) {
                tempStack.push(mainStack.pop());
            }
        }
        return tempStack.pop();
    }

    public int peek() {
        if (tempStack.isEmpty()){
            while (!mainStack.isEmpty()){
                tempStack.push(mainStack.pop());
            }
        }
        return tempStack.peek();
    }


    public  boolean empty(){
        return mainStack.isEmpty() && tempStack.isEmpty();
    }



}
