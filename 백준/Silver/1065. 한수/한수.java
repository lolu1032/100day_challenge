
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int num = 1; num <= n; num++) {
            if(num < 100) {
                count++;
            } else if(num < 1000) {
                int a = num / 100;
                int b = (num / 10) % 10;
                int c = num % 10;

                if(b * 2 == a + c) {
                    count++;
                }
            } else if(num == 1000) {
                break;
            }
        }
        System.out.println(count);
    }
}
