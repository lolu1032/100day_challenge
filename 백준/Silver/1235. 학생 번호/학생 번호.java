
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for(int i = 1; i < n; i++) {

            for (int k = 1; k <= arr[0].length(); k++) {
                Set<String> set = new HashSet<>();
                boolean unique = true;

                for (String num : arr) {
                    String sub = num.substring(num.length() - k);
                    if (!set.add(sub)) {
                        unique = false;
                        break;
                    }
                }

                if (unique) {
                    System.out.println(k);
                    return;
                }
            }
        }
    }
}
