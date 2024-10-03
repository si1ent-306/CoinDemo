package math282a1q1;

public class q6g extends ACFunction{
    //Formula for question 6g
    @Override
    public double calculate(double x) {
        return (1000000*Math.exp(x)) + (435000/x) * (Math.exp(x)-1);
    }
}
