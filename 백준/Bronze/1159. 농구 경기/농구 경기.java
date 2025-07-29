import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            char a = str.charAt(0);
            arr[i] = String.valueOf(a);
        }
        String[] alphabet = new String[26];
        char currentChar = 'a';

        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(currentChar);
            currentChar++;
        }
        Arrays.sort(arr);
        for(int i = 0; i < 26; i++) {
            count = 0;
            for(int j = 0; j < n; j++) {
                if(alphabet[i].equals(arr[j])) {
                    count++;
                }
                if(count >= 5) {
                    sb.append(alphabet[i]);
                    break;
                }
            }
        }
        if(sb.length() != 0) {
            System.out.println(sb);
        }else {
            System.out.println("PREDAJA");
        }

    }
}
