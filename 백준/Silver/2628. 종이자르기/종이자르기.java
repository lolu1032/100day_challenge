import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int k = sc.nextInt();

        int[] cutM = new int[m + 1];
        int[] cutN = new int[n + 1];

        for(int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0) {
                cutM[b] = 1;
            }else {
                cutN[b] = 1;
            }
        }
        int temp = 0;		int maxN = 0;
        for (int i = 1; i <= n; i++) {
            temp++;
            if (cutN[i] == 1 || i == n) {
                maxN = Math.max(maxN, temp);
                temp = 0;
            }
        }
        temp = 0;
        int maxM = 0;
        for (int i = 1; i <= m; i++) {
            temp++;
            if (cutM[i] == 1 || i == m) {
                maxM = Math.max(maxM, temp);
                temp = 0;
            }
        }
        System.out.println(maxM * maxN);
    }
}