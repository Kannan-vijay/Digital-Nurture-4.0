import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Number 1 :");
            int num1 = sc.nextInt();
            System.out.println("Enter the Number 2 :");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Divided Result is :" + result);
        } catch (Exception e) {
            System.out.println("Exception will be occcured :" + e.getMessage());
        }
        sc.close();
    }
}
