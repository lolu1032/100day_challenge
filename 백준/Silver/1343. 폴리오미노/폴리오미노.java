import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        while (str.contains("XXXX")) {
            str = str.replace("XXXX", "AAAA");
        }
        
        while (str.contains("XX")) {
            str = str.replace("XX", "BB");
        }
        
        if (str.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(str);
        }
    }
}