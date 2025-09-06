import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String st = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            if (i + st.length() <= str.length() && str.substring(i, i + st.length()).equals(st)) {
                sb.append("*");
                i += st.length() - 1;
                count++;
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        System.out.println(count);
    }
}
