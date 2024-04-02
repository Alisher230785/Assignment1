import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a,n));
    }
    public static int power(int a, int n) {
        if(n == 1) {
            return a;
        }
        return a * power(a,n-1);
    }
}
