package personal;

public class Main {

    public static void main(String[] args) {


        calculate(10,2,Operation.MULTIPLY);



    }

private static void calculate(int x, int y, Operation operation){

        switch (operation){
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
