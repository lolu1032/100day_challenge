import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] rankInput = new int[n];
        for (int i = 0; i < n; i++) {
            rankInput[i] = sc.nextInt();
        }

        List<Integer> rankList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int pos = rankInput[i] - 1;
            pos = Math.min(pos, rankList.size());
            rankList.add(pos, i + 1);
        }

        int[] rankInput2 = new int[m];
        for (int i = 0; i < m; i++) {
            rankInput2[i] = sc.nextInt();
        }
        List<Integer> secondRacePlayers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            secondRacePlayers.add(rankList.get(i));
        }

        List<Integer> secondRank = new ArrayList<>();
        for (int i = m - 1; i >= 0; i--) {
            int pos = rankInput2[m - 1 - i] - 1;
            pos = Math.min(pos, secondRank.size());
            secondRank.add(pos, secondRacePlayers.get(i));
        }

        secondRank.stream().limit(3).forEach(System.out::println);

    }
}
