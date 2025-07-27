import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] str = new String[8][8];
        int count = 0;
        for(int i = 0; i < str.length; i++) {
            String s = sc.nextLine();
            for(int j = 0; j < str[0].length; j++) {
                if(i == 0 || i % 2 != 0) {
                    if((i+j) % 2 == 0 && s.charAt(j)=='F') {
                        count++;
                    }
                }else {
                    if((i+j) % 2 == 0 && s.charAt(j)=='F') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}