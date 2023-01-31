package personal;

public class Main {

    public static void main(String[] args) {

        System.out.println(Operation.PI.getValue());
        calculate(10, 2, Operation.DIVIDE);
        calculate(10, 2, Operation.dog);


        System.out.println("--------------------------------------");


        Double PI = Operation.PI.getValue();

        System.out.println(PI);


    }

    private static void calculate(int x, int y, Operation operation) {

        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;

            default:
                System.err.println("IMPROPER CHOICE BOY!");
        }

    }


}
