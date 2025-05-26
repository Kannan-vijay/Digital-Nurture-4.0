import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Calculate the Nth fibonacci :");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci Value is " + fibo(n));
        sc.close();
    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
