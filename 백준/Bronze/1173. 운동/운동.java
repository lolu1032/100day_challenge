import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 운동시간
        int m = sc.nextInt(); // 초기맥박
        int M = sc.nextInt(); // 넘으면안되는 맥박
        int T = sc.nextInt(); // 1분 운동하면 오름
        int R = sc.nextInt(); // 1분쉬면 내려감
        if (m + T > M) {
            System.out.println(-1);
            return;
        }
        int count = 0;
        int time = 0;
        int i = m;
        while(count < N) {
            if (i + T <= M) {
                i = i + T;
                count++;
            } else {
                i = Math.max(i - R, m);
            }
            time++;
        }
        System.out.println(time);
    }
}
