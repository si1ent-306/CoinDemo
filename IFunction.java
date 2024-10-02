package math282a1q1;

public interface IFunction {
    public double calculate( double x );
    void printTable(double v, double v1, double v2)
            throws IllegalArgumentException;;
    public double findZero(double v, double v1, double v2);
}
