package week_12.assigment.exercise_01;

public class CalculatorWithException {
    public static void main(String[] args) {


        if (args.length != 3) {
            System.out.println("Usage: java Calculator number1 operator number2");
            System.exit(1);
        }


        int result = 0;

        try {
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

        } catch (NumberFormatException num) {
            System.out.println("invlid input " + num.getMessage());


        }

    }

}



