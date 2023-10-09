public class Factorial {
    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate the factorial of a different number

        int factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
