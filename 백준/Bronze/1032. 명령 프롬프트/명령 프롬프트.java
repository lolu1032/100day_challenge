import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            boolean bl = true;
            for(int j = 1; j < n; j++) {
                if(arr[j].charAt(i) != ch) {
                    bl = false;
                    break;
                }
            }
            sb.append(bl ? ch : "?");
        }

        System.out.println(sb);
    }
}
