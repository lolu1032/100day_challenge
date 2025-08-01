import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Long count = 0L;
        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                continue;
            }
            if(arr[i] < b) {
                count += b;
            }else {
                if(arr[i] % b != 0) {
                    count = count + (arr[i]/b+1) * b;
                }else {
                    count = count + (arr[i]/b) * b;
                }
            }
        }
        System.out.println(count);

    }
}
