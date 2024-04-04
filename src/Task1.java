import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }
        int min = returnMin(seq);
        System.out.println(min);
        sc.close();
    }

    /**
     * this method find the minimum number of a given array
     * it uses a loop approach
     * time complexity: 0(n), where n is the number of numbers in array
     * the loop iterate from 1 to n,
     * resulting in linear time complexity
     *
     * @param seq the array of numbers which we find the minimum
     * @return the minimum number from the array
     */
    public static int returnMin(int[] seq) {
        int min = seq[0];
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] < min) {
                min = seq[i];
            }
        }
        return min;
    }
}

