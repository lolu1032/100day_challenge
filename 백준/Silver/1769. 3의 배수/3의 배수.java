import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        if(n.length() == 1) {
            if((n.charAt(0) - '0') % 3 == 0) {
                System.out.println(count);
                System.out.println("YES");
            }else {
                System.out.println(count);
                System.out.println("NO");
            }
            return;
        }
        boolean bl = true;
        while (bl) {
            int num = 0;
            for(int i = 0; i < n.length(); i++) {
                num += n.charAt(i) - '0';
            }
            n = String.valueOf(num);
            count++;
            if(num < 10) {
                bl = false;
                if(num % 3 == 0) {
                    System.out.println(count);
                    System.out.println("YES");
                }else {
                    System.out.println(count);
                    System.out.println("NO");
                }
            }
        }
    }
}
