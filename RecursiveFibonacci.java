import java.util.Scanner;
public class RecursiveFibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its fibonacci sequence: ");
        int n = input.nextInt();

        System.out.println("The nth term of the Fibonacci sequence is: " + nthFibonacci(n));
    }
    /**
     * Static method that accepts an integer and returns the nth term in the Fibonacci Sequence
     *
     * @param n an integer provided by the user from main method
     * @return the term at the specified location in the Fibonacci Sequence
     */
    static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}