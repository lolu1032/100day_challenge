import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int one = arr[0];
        int count = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 1; i < n; i++) {
            pQ.offer(arr[i]);
        }
        while (!pQ.isEmpty() && one <= pQ.peek()) {
            int top = pQ.poll();
            top--;
            one++;
            count++;
            pQ.offer(top);
        }
        System.out.println(count);
    }
}