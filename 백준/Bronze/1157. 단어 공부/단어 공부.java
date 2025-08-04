import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[26];
        int[] array = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (char) (i + 65);
        }

        String str = sc.next();

        String s = str.toUpperCase();

        for(int i = 0; i < str.length(); i++) {
            char ch = s.charAt(i);
            for(int j = 0; j < arr.length; j++) {
                if(ch == arr[j]) {
                    array[j]++;
                    break;
                }
            }
        }

        int max = array[0];
        char chs = arr[0];
        boolean bl = true;
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                chs = arr[i];
                bl = true;
            }else if(max == array[i]) {
                bl = false;
            }
        }
        System.out.println(bl ? chs : "?");
    }
}
