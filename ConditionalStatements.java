public class ConditionalStatements {
    public static void main(String[] args) {
        // Initializing
        int a = -2345;

        // Checking if the value of 'a' is positive
        if(a > 0) {
            // If 'a' is greater than 0, print that the number is positive
            System.out.println("the number is positive");
        }
        // If 'a' is not positive, check if it's negative
        else if(a < 0) {
            // If 'a' is less than 0, print that the number is negative
            System.out.println("the number is negative");
        }
        // If 'a' is neither positive nor negative, it must be 0
        else {
            // If 'a' is 0, print that it is 0
            System.out.println("its 0");
        }
    }
}
