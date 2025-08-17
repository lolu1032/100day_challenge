import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            boolean[] seen = new boolean[26];
            char prev = 0;
            boolean safe = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c != prev) {
                    if (seen[c - 'a']) {
                        safe = false;
                        break;
                    }
                    seen[c - 'a'] = true;
                }
                prev = c;
            }

            if (safe) count++;
        }

        System.out.println(count);
    }
}
