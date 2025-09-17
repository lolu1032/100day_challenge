import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            String st = sc.next();
            if(st.equals("push")){
                int a = sc.nextInt();
                stack.add(a);
            }else if(st.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else {
                    System.out.println(stack.pop());
                }
            }else if(st.equals("size")){
                System.out.println(stack.size());
            }else if(st.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }else if(st.equals("top")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
