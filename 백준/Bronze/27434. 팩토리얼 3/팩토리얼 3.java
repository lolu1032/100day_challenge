import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fact(1,n));
    }
    public static BigInteger fact(int a, int n){
        BigInteger num = new BigInteger(String.valueOf(a));

        if(a < n) {
            int num2 = (a+n) / 2;
            num = fact(a,num2).multiply(fact(num2 + 1 , n));
        }
        return num;
    }
}
