import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Second Number :");
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Operator to perform the operation :");
        char Operator = sc.next().charAt(0);
        int result = 0;
        switch (Operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Number @ cannot be zero..!");
                }
                result = number1 / number2;
                break;

            default:
                System.out.println("Enter the Correct operator..");
                break;
        }
        System.out.println(number1 + " " + Operator + " " + number2 + " = " + result);
        sc.close();

    }
}
