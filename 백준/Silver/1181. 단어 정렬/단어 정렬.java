
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            String str = sc.next();

            arr[i] = str;
        }

        String[] result = Arrays.stream(arr)
                .distinct()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo))
                .toArray(String[]::new);

        for(String i : result) {
            System.out.println(i);
        }

    }
}
