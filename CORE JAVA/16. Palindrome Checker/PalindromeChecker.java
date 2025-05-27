import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Check it is palindrome or Not :");
        StringBuilder inputString = new StringBuilder(sc.nextLine());
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();
        if (reversedString.equals(inputString)) {
            System.out.println(inputString + " is Palindrome!!");
        } else {
            System.out.println(inputString + " is Not a Palindrome..!!");
        }
        sc.close();
    }
}