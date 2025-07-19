import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i*2; j++) { // 2* 5 - 1 - 0
                System.out.print("*");
            }
            System.out.println();
        }
    }
}