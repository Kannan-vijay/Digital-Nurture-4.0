import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Calculate the Factorial :");
        int number = sc.nextInt();
        long factorialresult = 1L;
        for (int i = 1; i <= number; i++) {
            factorialresult *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorialresult);
        sc.close();
    }
}
