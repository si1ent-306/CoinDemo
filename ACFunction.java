package math282a1q1;

/**
 *  Abstract class for functions to be used for finding zeros, etc.<br>
 *
 * @author     MATH 282
 * @created    August 30, 2017
 */

public abstract class ACFunction implements IFunction
{
    /**
     *  Returns the value of the function at a chosen point - must implement<br>
     *  specific calculations in any function class extending ACFunction<br>
     *
     * @param  x  Value to evaluate function at
     * @return    Value of function at argument
     */
    public abstract double calculate( double x );

    public double findZero(double xEvalPos, double xEvalNeg,double precision)
    {
        //xEvalNeg is the x val which point to a negative func value
        //xEvalPos is the x val which point to a positive func value
        double guess = 0.0;
        double median = 0.0;
        while(Math.abs(xEvalPos-xEvalNeg)>precision) // Control precision
        {
            median = (xEvalNeg+xEvalPos)/2;
            guess = calculate(median);
            if (guess==0.0) break;
            if(guess>0.0)
            {
                xEvalPos = median;
            }
            else {
                xEvalNeg = median;
            }
        }
        return median;
    }

    public double find1564000(double xEvalPos, double xEvalNeg,double precision){
        double guess = 0.0;
        double median = 0.0;
        while(Math.abs(xEvalPos-xEvalNeg)>precision) // Control precision
        {
            median = (xEvalNeg+xEvalPos)/2;
            guess = calculate(median);
            if (guess==0.0) break;
            if(guess>0.0)
            {
                xEvalPos = median;
            }
            else {
                xEvalNeg = median;
            }
        }
        return median;
    }
    /**
     *  Prints table of function values over specified range<br>
     *  by specified step - can paste into Excel and graph<br>
     *
     * @param  dStart  Starting value of x for table of function values
     * @param  dEnd    Ending value of x for table of function values
     * @param  dStep   Amount to increment x for table of function values
     * @return         Nothing
     * @throws         //Starting value of range greater than ending value
     * @throws         //Increment not positive
     */
    public void printTable( double dStart, double dEnd, double dStep )
            throws IllegalArgumentException
    {
        if ( dStart > dEnd )
        {
            throw new IllegalArgumentException( "Start must be <= End" );
        }
        if ( dStep <= 0 )
        {
            throw new IllegalArgumentException( "Step must be > 0" );
        }
        System.out.println( " x \t f(x) " );
        System.out.println( "===\t======" );
        for ( double x = dStart; x <= dEnd; x += dStep )
        {
            System.out.println( x + "\t" + this.calculate( x ) );
        }
        System.out.println( );
    }

    public void printTable1564000( double dStart, double dEnd, double dStep )
            throws IllegalArgumentException
    {
        if ( dStart > dEnd )
        {
            throw new IllegalArgumentException( "Start must be <= End" );
        }
        if ( dStep <= 1564000 )
        {
            throw new IllegalArgumentException( "Step must be > 0" );
        }
        System.out.println( " x \t f(x) " );
        System.out.println( "===\t======" );
        for ( double x = dStart; x <= dEnd; x += dStep )
        {
            System.out.println( x + "\t" + this.calculate( x ) );
        }
        System.out.println( );
    }
}