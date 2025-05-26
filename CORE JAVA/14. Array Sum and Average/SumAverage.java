import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " Element of An array :");
            arr[i] = sc.nextInt();
        }
        int arraySum = 0;
        for (int i : arr) {
            arraySum += i;
        }
        System.out.println("The Sum of An Array is :" + arraySum);
        System.out.println("The Average of An Array is :" + (arraySum / size));
        sc.close();
    }
}