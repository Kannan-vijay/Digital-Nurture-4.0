import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check it is Even or Odd :");
        int Number = sc.nextInt();
        if (isEven(Number)) {
            System.out.println(Number + " Is a Even Number!!");
        } else {
            System.out.println(Number + " Is a Odd Number!!");
        }
        sc.close();
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}