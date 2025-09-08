import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] s = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            s[i] = arr[i];
        }
        Arrays.sort(arr);
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = arr[i];
        }

        boolean[] used = new boolean[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[j] && s[i] == list[j]) {
                    sb.append(j +" ");
                    used[j] = true;
                    break;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
