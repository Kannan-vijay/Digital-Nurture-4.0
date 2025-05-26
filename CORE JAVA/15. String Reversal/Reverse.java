import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word to reverse :");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("The Original String :"+sb);
        sb.reverse();
        System.out.println("The Reversed String :"+sb);
        sc.close();
    }
}
