package week_12.assigment.exercise_01;

public class CalculatorWithIf {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator number1 operator number2");
            System.exit(1);
        }

        isNumeric(args[0]);
        isNumeric(args[2]);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;

            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;

            case '*':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;

            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;

        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);


    }


    public static void isNumeric(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                System.out.println("invlid input " + num);
                System.exit(0);

            }

        }

    }
}
