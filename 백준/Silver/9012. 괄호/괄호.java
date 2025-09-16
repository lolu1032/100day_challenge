import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String st = sc.next();
            int count = 0;
            boolean bl = true;
            for(int j = 0; j < st.length(); j++) {
                if(st.charAt(j) == '(') {
                    count++;
                }else {
                    count--;
                }
                if(count < 0) {
                    bl = false;
                    break;
                }
            }
            if(bl && count == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
