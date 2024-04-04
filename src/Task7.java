import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        showReverse(n,sc);
    }

    /**
     * Displays the reverse of a sequence of numbers entered through the Scanner
     * it uses a recursive approach
     * This method recursively reads 'n' integers from the provided Scanner 'sc' and displays them in reverse order
     * Time Complexity: O(n), where n is the number of integers to be read and displayed
     * The recursive algorithm reads 'n' integers and prints them in reverse order
     * resulting in linear time complexity
     *
     * @param n The number of integers to read and display
     * @param sc The Scanner object used to read input
     */
    public static void showReverse(int n, Scanner sc) {
        if(n == 0) {
            return;
        }
        int num = sc.nextInt();
        showReverse(n-1, sc);
        System.out.print(num + " ");
    }
}
