import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 1;
            for (int j = 0; j < a; j++) {
                count *= b - j;
                count /= j + 1;
            }
            System.out.println(count);
        }
    }
}
