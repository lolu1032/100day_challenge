import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next(); 
        int[] count = new int[10];  
        
        for (char c : number.toCharArray()) {
            count[c - '0']++;
        }
        
        int sixNine = (count[6] + count[9] + 1) / 2; // 올림 처리
        count[6] = sixNine;
        count[9] = sixNine;
        
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);
    }
}