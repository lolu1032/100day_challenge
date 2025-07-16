import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 2 3
        // 3 1 -> 3 2 1
        // 2 3 -> 2 3 1
        // 3 1 -> 2 1 3
        // 3 2 -> 3 1 2
        // 3

        // 1 2 3
        // 2 3 -> 1 3 2
        // 1 3 -> 3 1 2
        // 2 3 -> 2 1 3
        // 2 1 -> 1 2 3
        // 3 1 -> 3 2 1
        // 3

        int n = sc.nextInt();
        int[] arr = {1,2,3};
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int idx1 = -1;
            int idx2 = -1;

            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == a) {
                    idx1 = j;
                }
                if(arr[j] == b) {
                    idx2 = j;
                }
            }

            int num = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = num;
        }
        if(n != 0) {
            System.out.println(arr[0]);
        }else {
            System.out.println(-1);
        }

    }
}
