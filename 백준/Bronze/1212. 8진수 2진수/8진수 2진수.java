import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n.length(); i++) {
            int a = n.charAt(i) - '0';
            String str = Integer.toBinaryString(a);
            if(i == 0) {
                sb.append(str);
            }else {
                while (str.length() < 3) {
                    str = "0" + str; // 나머지 글자는 항상 3자리로 맞춤
                }
                sb.append(str);
            }
        }
        System.out.println(sb);


    }
}
