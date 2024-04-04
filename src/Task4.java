import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    /**
     * this method calculate the factorial of a given number
     * it uses a recursive approach
     * time complexity: 0(n), where n is the input number
     * the recursive algorithm iterates through n to 1
     * resulting in linear time complexity
     *
     * @param n the number for which the factorial is to be calculated
     * @return the factorial of the given number
     */
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
