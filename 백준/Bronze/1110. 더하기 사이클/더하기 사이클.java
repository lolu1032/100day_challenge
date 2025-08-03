import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = n;
        int count = 0;
        while(true) {
            StringBuilder sb = new StringBuilder();
            String str = String.valueOf(n);
            if (str.length() == 1) {
                str = "0" + str;
            }
            char[] arr = new char[str.length()];
            for(int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }

            int a = str.charAt(0) - '0';
            int b = str.charAt(1) - '0';
            int sum = a + b;

            sb.append(b).append(sum % 10);

            n = Integer.parseInt(sb.toString());

            count++;

            if(start == n) {
                break;
            }
        }
        System.out.println(count);
    }
}
