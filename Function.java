package math282a1q1;

public class Function extends ACFunction {
    public Function() {

    }
    public double calculate( double x )
    {
        return (-8 * x * x * x * x) - (((double) 73 /9) * x * x) +4;
        // could also use 21 * Math.pow( x, 2.0 ) - ...
    }
    public double findZero(double xValPosition, double xValNegative, double percision){
        double guess = 0.0;
        double middle = 0.0;
        while(Math.abs(xValPosition - xValNegative) > percision){ //control persiosion
            middle = (xValNegative + xValPosition) / 2.0;
            guess = calculate(middle);
            if (guess == 0.0){
                break;
            }
            else if (guess > 0.0){
                xValPosition = middle;
            }
            else {
                xValNegative = middle;
            }
        }
        return middle;
    }
}
