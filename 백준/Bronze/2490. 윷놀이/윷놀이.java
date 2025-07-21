import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배 1개 등 3개 A / 배 2개 등 2개 B / 배 3개 등 1개 C / 등 4개 윳 / 배 4개 모
        for(int j = 0; j < 3; j++) {
            int zero = 0; // 배
            int one = 0; // 등
            for(int i = 0; i < 4; i++) {
                int a = sc.nextInt();
                if(a == 0) {
                    zero++;
                }else {
                    one++;
                }
            }
            if(zero == 1 && one == 3) {
                System.out.println("A");
            }else if(zero == 2 && one == 2) {
                System.out.println("B");
            }else if(zero == 3 && one == 1) {
                System.out.println("C");
            }else if(zero == 4) {
                System.out.println("D");
            }else if(one == 4){
                System.out.println("E");
            }
        }

    }
}