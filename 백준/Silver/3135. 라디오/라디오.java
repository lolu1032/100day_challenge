import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();  // 현재 주파수
        int B = sc.nextInt();  // 목표 주파수
        int N = sc.nextInt();  // 즐겨찾기 버튼 개수

        int[] favorites = new int[N];
        for (int i = 0; i < N; i++) {
            favorites[i] = sc.nextInt();
        }

        // 방법 1: 단순히 +1/-1만 눌러서 이동
        int minPress = Math.abs(A - B);

        // 방법 2: 즐겨찾기 활용
        for (int f : favorites) {
            int presses = 1 + Math.abs(f - B); // 즐겨찾기 버튼 누름(1) + 나머지 이동
            minPress = Math.min(minPress, presses);
        }

        System.out.println(minPress);
    }
}
