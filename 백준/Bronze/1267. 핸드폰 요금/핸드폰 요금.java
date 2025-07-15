import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 영식 30초마다 10+ 민식 60초마다 15
        int n = sc.nextInt();
        int y = 0;
        int m = 0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a % 30 >= 0) {
                y += (a/30+1) * 10;
            }else {
                y += (a/30) * 10;
            }
            if(a % 60 >= 0) {
                m += (a/60+1) * 15;
            }else {
                m += (a/60) * 15;
            }
        }

        if(y > m) {
            System.out.println("M " + m);
        }else if(y < m){
            System.out.println("Y " + y);
        }else {
            System.out.println("Y M " + y);
        }
    }
}
