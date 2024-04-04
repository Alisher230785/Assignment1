import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isAllDigit(s) ? "Yes" : "No");
    }

    /**
     * Checks if a given string consists entirely of numeric digits
     * it uses a recursive approach
     * This method recursively examines each character of the input string 's' to determine if it contains only numeric digits
     * Time Complexity: O(n), where n is the length of the input string
     * The recursive algorithm iterates through each character of the string
     * resulting in linear time complexity
     *
     * @param s The input string to be checked
     * @return true if the string consists entirely of numeric digits, otherwise false
     */

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
