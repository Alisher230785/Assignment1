import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using Euclid's algorithm.
     * it uses a recursive approach
     * The greatest common divisor (GCD) of two integers a and b is the largest positive integer that divides both 'a' and 'b' without leaving a remainder.
     * Time Complexity: O(log(n)), where n is the minimum of a or b .
     * The Euclidean algorithm for finding the GCD involves repeated division with remainder
     * resulting in logarithmic time complexity.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor (GCD) of a and b
     */

    public static int GCD(int a, int b) {
        if(b == 0) {
            return a;
        }
        return GCD(b,a%b);
    }
}
