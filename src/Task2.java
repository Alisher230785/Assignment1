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

    public static double getAverage(int[] seq) {
        double sum = 0;
        for (int i : seq) {
            sum += i;
        }
        return sum / seq.length;
    }
}
