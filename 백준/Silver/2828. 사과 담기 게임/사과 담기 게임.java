import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int left = 1;
        int right = m;

        int count = 0;
        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();

            if(b < left) {
                count += left - b;
                left = b;
                right = b + m - 1;
            }else if(b > right) {
                count += b - right;
                right = b;
                left = b - m + 1;
            }
        }

        System.out.println(count);
    }
}
