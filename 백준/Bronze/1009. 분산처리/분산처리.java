import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a %= 10;
            if (a == 0) {
                System.out.println(10);
                continue;
            }

            int result = 1;
            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }
            System.out.println(result);
        }
    }
}