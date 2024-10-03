package math282a1q1;

public class q5 {


    public static void main(String[] args) {
        //For loop to calculate between -10 and 10
        for (int i = -10; i <= 10; i++) {
            //Value to calculate
            double value = 4.9 * Math.pow(10, i);
            System.out.printf("Calculating square root for: %.1e%n", value);


            //Babylonian square root method
            double sqrtFromOne = babylonianSqrt(value, 1);
            System.out.printf("Using starting value of 1: %.6f%n", sqrtFromOne);


            //Rough estimate method
            double roughEstimate = roughEstimateSqrt(value);
            double sqrtFromEstimate = babylonianSqrt(value, roughEstimate);
            System.out.printf("Using rough estimate: %.6f%n", sqrtFromEstimate);


            //Bult-in square root method
            double builtInSqrt = Math.sqrt(value);
            System.out.printf("Built-in sqrt: %.6f%n", builtInSqrt);

            System.out.println();
        }
    }


    //Method to get the rough estimate of square root
    public static double roughEstimateSqrt(double number) {
        // Throw error if the number is negative
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }

        //Using formula to get D
        int D = (int) Math.floor(Math.log10(number));

        //Returning 10^(D/2)
        return Math.pow(10, D / 2.0);
    }



    public static double babylonianSqrt(double S, double initialGuess) {
        //Throw error if the number is negative
        if (S < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        //Declare variables
        double guess = initialGuess;
        double prevGuess;
        int loopNumb = 0;


        //Calculate the value until it matches the decimal point
        do {
            //saving the previous guess
            prevGuess = guess;
            //use babylonian square root
            guess = (guess + S / guess) / 2.0;
            //tracking the number of loops
            loopNumb++;
        } while (Math.abs(guess - prevGuess) > 0.00001);

        //printing out the number of loops that it took
        System.out.printf("Number of loops: %d%n", loopNumb);
        return guess;
    }
    

}
