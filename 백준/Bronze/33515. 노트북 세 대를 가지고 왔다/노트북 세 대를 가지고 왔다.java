import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];

        for(int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[0] < arr[1]) {
            System.out.println(arr[0]);
        }else if(arr[0] > arr[1]) {
            System.out.println(arr[1]);
        }else {
            System.out.println(arr[0]);
        }
    }
}
