import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] arr = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        Arrays.sort(arr,Collections.reverseOrder());

        for(String i : arr) {
            System.out.print(i);
        }
    }
}
