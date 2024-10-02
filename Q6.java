package math282a1q1;

public class Q6 {
    public static void main(String[] args) {
        IFunction f3 = new Function();
        System.out.println("Table for p(x) = -8x^4 + 73/9 x^2 + 4");
        f3.printTable(-2.0, 5.0, 0.5);
        System.out.println(f3.findZero(-0.5, -1.0, 0.00001));
        System.out.println(f3.findZero(0.5, 1.0, 0.00001));


        q6e q6eThing = new q6e();
        System.out.println("Table for q(x) = q(x)=(-1)/√333 x^5+1/700 x^4+2/3 x^3+x+7 Between 3.5 and 4.0");
        q6eThing.printTable(-2.0, 5.0, 0.5);
        System.out.println("Zero: " + q6eThing.findZero(3.5, 4.0, 0.00001));
//        testThing.findZero();

        q6e q6eThing2 = new q6e();
        System.out.println("Table for q(x) = q(x)=(-1)/√333 x^5+1/700 x^4+2/3 x^3+x+7 Between -3.5 and -2.5");
        q6eThing2.printTable(-2.0, 5.0, 0.5);
        System.out.println("Zero for -3.5 -2.5: " + q6eThing2.findZero(-3.5, -2.5, 0.00001));

        q6e q6eThing3 = new q6e();
        System.out.println("Table between -2.5 and -1.5");
        q6eThing2.printTable(-2.0, 5.0, 0.5);
        System.out.println("Zero for -2.5 -1.5: " + q6eThing2.findZero(-1.5, -2.5, 0.00001));

        q6f question6f = new q6f();
        System.out.println("Question 6f, table for f(x)=e^((6/x))-4");
        question6f.printTable(-2.0, 5.0, 0.5);
        System.out.println(question6f.findZero(2.0, 6.0, 0.00001));


        q6g question6g = new q6g();
        System.out.println();
        question6g.printTable(-2.0, 5.0, 0.5);
        System.out.println(question6g.findZero(0.5, -0.5, 0.00001));
    }
}
