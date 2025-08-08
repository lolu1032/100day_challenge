import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stick = 64;
        int temp = 0;
        int count = 0;

        while(temp < n) {
            if(stick + temp > n) {
                stick/=2;
            }else {
                temp+= stick;
                count++;
            }
        }
        System.out.println(count);
    }
}
