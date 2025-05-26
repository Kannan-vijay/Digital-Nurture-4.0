import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to Check it Leap Year Or Not :");
        int year = sc.nextInt();
        if (isLeapyear(year)) {
            System.out.println(year + " IS a Leap Year!!");
        } else {
            System.out.println(year + " Is Not a Leap Year!!");
        }
        sc.close();
    }

    static boolean isLeapyear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
