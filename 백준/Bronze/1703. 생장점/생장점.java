import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            // 나무 나이
            int a = sc.nextInt();
            if(a == 0) {
                break;
            }
            int m = 1;

            for(int i = 0; i < a; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();
                m *= b;
                m-=c;
            }
            System.out.println(m);

        }
    }
}
