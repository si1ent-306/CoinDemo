package math282a1q1;

public class Q5 {


    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            double value = 4.9 * Math.pow(10, i);
            System.out.printf("Calculating square root for: %.1e%n", value);


            double sqrtFromOne = babylonianSqrt(value, 1);
            System.out.printf("Using starting value of 1: %.6f%n", sqrtFromOne);


            double roughEstimate = roughEstimateSqrt(value);
            double sqrtFromEstimate = babylonianSqrt(value, roughEstimate);
            System.out.printf("Using rough estimate: %.6f%n", sqrtFromEstimate);


            double builtInSqrt = Math.sqrt(value);
            System.out.printf("Built-in sqrt: %.6f%n", builtInSqrt);

            System.out.println();
        }
    }


    public static double roughEstimateSqrt(double S) {
        if (S <= 0) {
            throw new IllegalArgumentException("S must be positive.");
        }

        int D = (int) Math.floor(Math.log10(S));

        return Math.pow(10, D / 2.0);
    }


    public static double babylonianSqrt(double S, double initialGuess) {
        if (S < 0) {
            throw new IllegalArgumentException("S must be non-negative.");
        }
        double guess = initialGuess;
        double previousGuess;
        int loopCount = 0;


        do {
            previousGuess = guess;
            guess = (guess + S / guess) / 2.0;
            loopCount++;
        } while (Math.abs(guess - previousGuess) > 0.00001);


        System.out.printf("Number of loops: %d%n", loopCount);
        return guess;
    }
    

}
