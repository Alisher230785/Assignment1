import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoefficient(n,k));
    }

    /**
     * Calculates the binomial coefficient C(n, k) using a recursive approach
     * The binomial coefficient C(n, k) represents the number of ways to choose k elements from a set of n elements without considering the order
     * Time Complexity: O(2^n), where n is the largest of n and k
     * The recursive algorithm computes the binomial coefficient by summing the values of binomial coefficients of smaller problems
     * The number of recursive calls doubles with each step
     * resulting in exponential time complexity
     *
     * @param n The total number of elements
     * @param k The number of elements to choose
     * @return The binomial coefficient C(n, k)
     */

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
