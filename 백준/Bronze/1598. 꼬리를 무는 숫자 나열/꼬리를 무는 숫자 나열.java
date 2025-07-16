import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;

        int count = 0;

        count+= Math.abs(a/4 - b/4);

        count+=Math.abs(a%4 - b%4);

        System.out.println(count);


    }
}
