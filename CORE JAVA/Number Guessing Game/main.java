import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(101); // 0 - 100 Random Number 
        while (true) {
            System.out.println("Enter the Guessing Number :");
            int guessingNumber = sc.nextInt();
            if (guessingNumber == randomNumber) {
                System.out.println("Cngratulations You Guess the Correct Number!!!");
                break;
            }
            else if (guessingNumber < randomNumber) {
                System.out.println("Your Gussing Number Is Low!!");
            }
            else{
                System.out.println("Your Gussing Number is To High!!");
            }
        }
        sc.close();
    }
}
