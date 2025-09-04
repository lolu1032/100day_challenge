import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        Long b = sc.nextLong();

        if(n <= Math.pow(2,b+1) -1) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
