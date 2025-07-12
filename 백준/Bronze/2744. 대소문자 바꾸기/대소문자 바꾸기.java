import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(str.charAt(i));
            }else {
                ch = Character.toUpperCase(str.charAt(i));
            }
            System.out.print(ch);
        }
    }
}
