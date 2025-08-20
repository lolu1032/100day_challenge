import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] mines = new int[n][n]; 
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                char c = line.charAt(j);
                if (c == '.') mines[i][j] = 0;
                else mines[i][j] = c - '0';
            }
        }

        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i][j] > 0) { 
                    System.out.print("*");
                } else { 
                    int sum = 0;
                    for (int d = 0; d < 8; d++) {
                        int nr = i + dr[d];
                        int nc = j + dc[d];
                        if (nr < 0 || nc < 0 || nr >= n || nc >= n) continue;
                        sum += mines[nr][nc];
                    }
                    System.out.print(sum >= 10 ? "M" : sum);
                }
            }
            System.out.println();
        }
    }
}
