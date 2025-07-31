import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[a + b + c + 1];

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= b; j++) {
                for(int k = 1; k <= c; k++) {
                    arr[i+j+k]++;
                }
            }
        }

        int max = 0;
        int answer = 0;

        for (int i = 3; i <= a + b + c; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
