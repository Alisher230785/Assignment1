import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a,n));
    }

    /**
     * Calculates the power of a given base to the exponent
     * it uses a recursive approach
     * Time Complexity: O(n), where n is the exponent
     * The recursive algorithm iterates through the exponent
     * resulting in linear time complexity
     *
     * @param a The base
     * @param n The exponent
     * @return The result of raising 'a' to the power of 'n'
     */
    public static int power(int a, int n) {
        if(n == 1) {
            return a;
        }
        return a * power(a,n-1);
    }
}
