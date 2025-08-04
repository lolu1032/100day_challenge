import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        Arrays.sort(arr);
        int a = arr[0];
        while(true) {
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if(a % arr[i] == 0) {
                    count++;
                }
            }
            if(count >= 3) {
                System.out.println(a);
                break;
            }
            a++;
        }
    }
}
