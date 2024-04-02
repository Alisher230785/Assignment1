import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        showReverse(n,sc);
    }
    public static void showReverse(int n, Scanner sc) {
        if(n == 0) {
            return;
        }
        int num = sc.nextInt();
        showReverse(n-1, sc);
        System.out.print(num + " ");
    }
}
