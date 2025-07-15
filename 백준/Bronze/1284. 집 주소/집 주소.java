import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = 0;
            String str = sc.next();
            if(str.equals("0")) {
                return;
            }

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '1') {
                    num+=2;
                }else if(str.charAt(i) == '0') {
                    num+=4;
                }else {
                    num+=3;
                }
            }
            num += str.length()-1 + 2;

            System.out.println(num);



        }

    }
}
