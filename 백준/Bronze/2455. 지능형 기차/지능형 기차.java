import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int max = -1;
        for(int i = 0; i < 4; i++) {
            int n = sc.nextInt(); // 내린 사람
            int m = sc.nextInt(); // 탄 사람

            count = count - n + m;
            if(max  < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}