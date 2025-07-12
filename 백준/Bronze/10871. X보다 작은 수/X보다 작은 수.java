import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 정수 n개
        int n = sc.nextInt();

        // 수열 a
        int a = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(a > x) {
                sb.append(x).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
