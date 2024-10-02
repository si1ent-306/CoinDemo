package math282a1q1;

public class question2 {


    public static void main(String[] args) {
        // Finding the smallest positive float value
        float smallestFloat = findSmallestFloat();
        System.out.println("Smallest positive float: " + smallestFloat);

        // Finding the machine epsilon for float
        float epsilonFloat = findEpsilonFloat();
        System.out.println("Machine epsilon for float: " + epsilonFloat);

        // Finding the smallest positive double value
        double smallestDouble = findSmallestDouble();
        System.out.println("Smallest positive double: " + smallestDouble);

        // Finding the machine epsilon for double
        double epsilonDouble = findEpsilonDouble();
        System.out.println("Machine epsilon for double: " + epsilonDouble);
    }

    // Method to find the smallest positive float
    private static float findSmallestFloat() {

        float value = 1.0f;
        // Variable to hold previous value
        float previous = value;

        // Keep dividing the value by 2 until it becomes 0
        while (value > 0.0f) {
            previous = value;
            value /= 2.0f;
        }

        return previous;
    }

    //Method to find the epsilon for float
    private static float findEpsilonFloat() {
        // Start with epsilon as 1.0f (float)
        float epsilon = 1.0f;

        //keep divinding by 2 until it dosent change
        while (1.0f + epsilon > 1.0f) {
            epsilon /= 2.0f;
        }
        //return multiplying by 2 to get the last value that worked
        return epsilon * 2.0f;
    }

    // Method to find the smallest positive double
    private static double findSmallestDouble() {
        double value = 1.0;
        double previous = value;

        // Keep dividing the value by 2 until it becomes 0
        while (value > 0.0) {
            previous = value;
            value /= 2.0;
        }
        return previous;
    }

    // Method to find machine epsilon for double
    private static double findEpsilonDouble() {
        double epsilon = 1.0;

        while (1.0 + epsilon > 1.0) {
            epsilon /= 2.0;
        }

        return epsilon * 2.0;
    }


}
