import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        BigInteger A = new BigInteger(a,2);
        BigInteger B = new BigInteger(b,2);

        BigInteger add = A.add(B);

        String c = add.toString(2);

        System.out.println(c);
    }
}
