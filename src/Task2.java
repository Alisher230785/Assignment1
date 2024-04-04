import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }
        double avg = getAverage(seq);
        System.out.println(avg);
        sc.close();
    }
    /**
     * this method find the average of a given array
     * it uses a loop approach
     * time complexity: 0(n), where n is the number of numbers in array
     * the loop iterate from 0 to n,
     * resulting in linear time complexity
     *
     * @param seq the array of numbers which we find the average
     * @return the average number from the array
     */
    public static double getAverage(int[] seq) {
        double sum = 0;
        for (int i : seq) {
            sum += i;
        }
        return sum / seq.length;
    }
}
