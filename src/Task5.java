import java.util.Scanner;

public class Task5 {
    static int qw = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        System.out.println(qw);
    }

    /**
     * Calculates the nth fibonacci number of a given number
     * it uses a recursive approach
     * Time Complexity: O(2^n), where n is the input number
     * The recursive algorithm iterates through all Fibonacci numbers up to the given index
     * resulting in exponential time complexity
     *
     * @param n The Fibonacci number to be calculated
     * @return The Fibonacci number at the given number
     */

    public static int fibonacci(int n) {
        qw++;
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
