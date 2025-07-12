import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            switch (i) {
                case 0:
                    sb.append(1-n).append(" ");
                    break;
                case 1:
                    sb.append(1-n).append(" ");
                    break;
                case 2:
                    sb.append(2-n).append(" ");
                    break;
                case 3:
                    sb.append(2-n).append(" ");
                    break;
                case 4:
                    sb.append(2-n).append(" ");
                    break;
                case 5:
                    sb.append(8-n);
                    break;
                default:
                    return;
            }
        }
        System.out.println(sb);

    }
}
