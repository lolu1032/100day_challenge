import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        BigInteger i = BigInteger.TWO;

        while(i.compareTo(m) == -1) {
            if(n.mod(i).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + i);
                return;
            }
            i = i.add(BigInteger.ONE);
        }

        System.out.println("GOOD");
    }
}
