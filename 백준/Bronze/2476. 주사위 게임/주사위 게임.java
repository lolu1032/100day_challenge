import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int max = -1;
        for(int i = 0; i <n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == b && b == c) {
                count = 10000 + a * 1000;
            }else if(a == b || a == c) {
                count = 1000 + a * 100;
            }else if(b == c) {
                count = 1000 + b * 100;
            }else {
                if(a > b && a > c) {
                    count = 100 * a;
                }else if(b > a && b > c) {
                    count = 100 * b;
                }else {
                    count = 100 * c;
                }
            }
            if(max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}