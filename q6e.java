package math282a1q1;

public class q6e extends ACFunction{
    //Formula for question 6e
    @Override
    public double calculate(double x) {
        return ((-1/Math.sqrt(333))*x*x*x*x*x)+( ((double) 1 /700)*x*x*x*x) + (((double) 2 /3)*x*x*x) +x+7;
    }
}
