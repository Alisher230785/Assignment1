import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isAllDigit(s) ? "Yes" : "No");
    }
    public static boolean isAllDigit(String s) {
        if(s.isEmpty()) {
            return true;
        }
        if(!Character.isDigit(s.charAt(0))) {
            return false;
        }
        return isAllDigit(s.substring(1));
    }
}
