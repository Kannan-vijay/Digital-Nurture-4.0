public class OverLoading {
    public static void main(String[] args) {
        // Two integers
        add(5, 10);

        // Three Integers
        add(2, 3, 4);

        // Two Double Integers
        add(5.4, 6.3);
    }

    static void add(int a, int b) {
        System.out.println("The sum of Result is " + (a + b));
    }

    static void add(double a, double b) {
        System.out.println("The sum of Result is " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("The sum of Result is " + (a + b + c));
    }
}
