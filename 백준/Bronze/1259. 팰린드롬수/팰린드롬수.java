import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String n = sc.next();
            if(n.equals("0")) {
                break;
            }
            StringBuilder sb = new StringBuilder();

            for(int i = n.length()-1; i >= 0; i--) {
                char ch = n.charAt(i);
                sb.append(ch);
            }
            if(sb.toString().equals(n)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }

    }
}
