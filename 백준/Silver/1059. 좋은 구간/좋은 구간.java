import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int c = sc.nextInt();

        Arrays.sort(arr);
        for (int x : arr) {
            if (x == c) {
                System.out.println(0);
                return;
            }
        }
        int L = 0;
        int R = 1000;

        for (int x : arr) {
            if (x < c) {
                L = Math.max(L, x);
            } else if (x > c) {
                R = Math.min(R, x);
            }
        }

        int leftChoices = c - (L + 1) + 1;
        int rightChoices = (R - 1) - c + 1;
        int answer = leftChoices * rightChoices - 1;

        System.out.println(answer);
    }
}
