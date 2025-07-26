import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

        int a = 0;
        int b = 0;
        int c = 0;
        long count = 0;
        String s = sc.next();
        String t = sc.next();
        String r = sc.next();
        for(int j = 0; j < str.length; j++) {
            if(s.equals(str[j])){
                a = j;
            }
            if(t.equals(str[j])) {
                b = j;
            }
            if(r.equals(str[j])) {
                c = j;
            }
        }
        if(c == 0) {
            count = 1;
        }else if(c == 1) {
            count = 10;
        }else if(c == 2) {
            count = 100;
        }else if(c == 3) {
            count = 1000;
        }else if(c == 4) {
            count = 10000;
        }else if(c == 5) {
            count = 100000;
        }else if(c == 6) {
            count = 1000000;
        }else if(c == 7) {
            count = 10000000;
        }else if(c == 8) {
            count = 100000000;
        }else {
            count = 1000000000;
        }
        System.out.println((a*10 + b)*count);
    }
}