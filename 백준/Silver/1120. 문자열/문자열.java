
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String n2 = sc.next();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n2.length() - n.length(); i++) {
            int diff = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) != n2.charAt(i + j)) {
                    diff++;
                }
            }
            minDiff = Math.min(minDiff, diff);
        }
        System.out.println(minDiff);
    }
}
