import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Composite");
    }
    /**
     * this method find out if the given number is prime
     * it uses a loop approach
     * time complexity: 0(n), where n is the number of numbers in array
     * the loop iterate from 2 to n,
     * resulting in linear time complexity
     *
     * @param n the number which we find out if the number is prime
     * @return true if the number is prime, otherwise false
     */
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
