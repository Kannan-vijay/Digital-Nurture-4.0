import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark To Calculate the Grade :");
        int mark = sc.nextInt();
        char Grade = ' ';
        if (mark>=90 && mark <= 100) {
            Grade = 'A';
        }
        else if (mark >= 80 && mark < 90) {
            Grade = 'B';
        }
        else if (mark >= 70 && mark < 80) {
            Grade = 'C';
        }
        else if (mark >= 60 && mark < 70) {
            Grade = 'D';
        }
        else {
            Grade = 'F';
        }
        System.out.println("Grade for "+mark+" is "+Grade);
        sc.close();
    }
}
