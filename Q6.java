package math282a1q1;

public class Q6 {
    public static void main(String[] args) {
        IFunction f3 = new Function();
        System.out.println("Table for p(x) = -8x^4 + 73/9 x^2 + 4");
        f3.printTable(-2.0, 5.0, 0.5);
        System.out.println(f3.findZero(-0.5, -1.0, 0.00001));
        System.out.println(f3.findZero(0.5, 1.0, 0.00001));
    }
}
