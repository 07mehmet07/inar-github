package week_14.assigment;

import java.util.Stack;

public class Question_14_10 {
    public static void main(String[] args) {
        try {
            String prifix = "1 2 + 3 *";
            String[] list = prifix.split("\\s+");
            int result = prifixExplanation(list);
            System.out.println("Output : " + result);
            System.out.printf("Explanation ((%s %s %s) %s %s ) = %s", list[0], list[2], list[1], list[4], list[3], result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    private static int prifixExplanation(String[] list) {
        Stack<Integer> stack = new Stack<>();
        for (String symbol : list) {
            if (symbol.matches("-?\\d+")) {
                stack.push(Integer.parseInt(symbol));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (symbol) {
                    case "+":
                        stack.push(operand2 + operand1);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid Operand!");
                }
            }
        }
        return stack.pop();
    }
}
