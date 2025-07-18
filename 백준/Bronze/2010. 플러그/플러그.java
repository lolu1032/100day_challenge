import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            num += a;
            if(i > 0) {
                num-=1;
            }
        }
        System.out.println(num);
    }
}
