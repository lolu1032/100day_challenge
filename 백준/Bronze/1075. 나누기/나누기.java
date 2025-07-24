import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int f = (n/100)*100;

        for(int i = 0; i < 100; i++) {
            int num = f + i;
            if(num % m == 0) {
                System.out.printf("%02d",num % 100);
                return;
            }
        }
    }
}