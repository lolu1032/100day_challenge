import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            BigInteger bi = BigInteger.ZERO;
            int n = sc.nextInt();
            for(int j = 0; j < n; j++) {
                BigInteger a = sc.nextBigInteger();
                bi = bi.add(a);
            }
            if(bi.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            }else if(bi.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            }else {
                System.out.println("0");
            }
        }
    }
}
