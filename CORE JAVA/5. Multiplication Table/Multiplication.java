import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table Number You want to Print :");
        int multiplier = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" * "+multiplier+" = "+(i*multiplier));
        }
        sc.close();
    }
}
