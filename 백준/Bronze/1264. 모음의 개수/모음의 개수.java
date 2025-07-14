import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = 0;
            String str = sc.nextLine();

            if(str.equals("#")) {
                return ;
            }
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                        str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
