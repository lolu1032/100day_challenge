import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int mul = 0;
        Long count = 0L;

        for(int i = 0; i < a.length(); i++) {
            for(int j = 0; j < b.length(); j++) {
                int aa = a.charAt(i) - '0';
                int bb = b.charAt(j) - '0';
                mul = aa * bb;
                count+=mul;
            }
        }
        System.out.println(count);
    }
}
