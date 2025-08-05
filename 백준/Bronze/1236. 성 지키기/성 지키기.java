import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] ch = new char[n][m];
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            ch[i] = str.toCharArray();
        }

        int row = 0;
        for(int i = 0; i < n; i++) {
            boolean bl = true;
            for(int j = 0; j < m; j++) {
                if(ch[i][j] == 'X') {
                    bl = false;
                    break;
                }
            }
            if(bl) row++;
        }
        int col = 0;
        for(int i = 0; i < m; i++) {
            boolean bl = true;
            for(int j = 0; j < n; j++) {
                if(ch[j][i] == 'X') {
                    bl = false;
                    break;
                }
            }
            if(bl) col++;
        }

        System.out.println(Math.max(row,col));

    }
}
