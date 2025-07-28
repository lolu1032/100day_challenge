
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.trim();
        String[] arr = st.split(" ");

        if(st.equals("")) {
            System.out.println(0);
        }else {
            System.out.println(arr.length);
        }
    }
}
