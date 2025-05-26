
public class Precedence {
    public static void main(String[] args) {
        int number = 10 + 5 * 2;
        System.out.println(number);
        // What will be the value of number? Will it be (10 + 5)*2, that is, 30? Or it will be 10 + (5 * 2), that is, 20?

        // When two operators share a common operand, 5 in this case, the operator with the highest precedence is operated first.

        // In Java, the precedence of * is higher than that of +. Hence, the multiplication is performed before subtraction, 
        // and the value of number will be 5.
    }
}
