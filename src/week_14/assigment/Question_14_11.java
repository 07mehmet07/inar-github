package week_14.assigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Stack;

public class Question_14_11 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Dell\\IdeaProjects\\inar-github\\src\\week_14\\assigment\\Question_14_02.java");

        if (!file.exists()) {
            System.out.print("File does not exist");
            System.exit(1);
        }

        System.out.println("The source code " +
                (isCorrectPair(file) ? "has " : "has not ") +
                "correct pairs of grouping symbols");

    }

    private static boolean isCorrectPair(File file) throws FileNotFoundException {
        Stack<Character> stack = new Stack<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                for (char ch : s.toCharArray()) {
                    if (ch == '(' || ch == '{' || ch == '[') {
                        stack.add(ch);
                    } else if (ch == ')' || ch == '}' || ch == ']') {
                        if (stack.isEmpty() || !isMatched(ch, stack.pop())) {
                            return false;
                        }
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatched(char ch, Character peek) {
        return (ch == ')' && peek == '(') ||
                (ch == '}' && peek == '{') ||
                (ch == ']' && peek == '[');
    }
}
