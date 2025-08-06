import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= m; i++) {
            for(int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        int count = 0;
        for(int i = n-1; i < m; i++) {
            count+=list.get(i);
        }
        System.out.println(count);
    }
}
