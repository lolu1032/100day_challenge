import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];

        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for(int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int col = 0;
        int row = 0;

        for(int i = 0; i < arr.length; i++) {
            boolean bl = false;
            int count = 0;
            for(int j = 0; j <arr[0].length; j++) {
                if(arr[i][j] == '.') {
                    count++;
                    if(j == arr[0].length-1 && count >=2) {
                        row++;
                    }
                }else {
                    if(count >= 2) {
                        bl = true;
                    }
                    count = 0;
                }
                if(bl) {
                    row++;
                    bl = false;
                }
            }
        }
        for(int i = 0; i < arr[0].length; i++) {
            boolean bl = false;
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j][i] == '.') {
                    count++;
                    if(j == arr[0].length-1 && count >=2) {
                        col++;
                    }
                }else {
                    if(count >= 2) {
                        bl = true;
                    }
                    count = 0;
                }
                if(bl) {
                    col++;
                    bl = false;
                }
            }
        }
        System.out.println(row+ " " + col);
    }
}