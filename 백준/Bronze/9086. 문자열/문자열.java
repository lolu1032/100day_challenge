import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            char a = 0, b = 0;
            for(int j = 0; j < str.length(); j++) {
                a = str.charAt(0);
                b = str.charAt(str.length()-1);
            }
            System.out.println(a+""+ b);
        }
    }
}
