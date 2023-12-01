package 실버3;

import java.util.Scanner;

public class _달팽이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] map = new int[n][n];
        int value = n * n;
        int x = 0, y = 0;
        int start = 0;
        int limit = n;
        while (value > 0) {
            x = start;
            for (int i = y; i < limit; i++) {
                map[i][x] = value--;
            }

            y = limit - 1;
            for (int i = x + 1; i < limit; i++) {
                map[y][i] = value--;
            }

            x = limit - 1;
            for (int i = y - 1; i >= start; i--) {
                map[i][x] = value--;
            }

            y = start;
            for (int i = x - 1; i > start; i--) {
                map[y][i] = value--;
            }
            start++;
            limit--;
            y = start;
        }

        StringBuilder sb = new StringBuilder();
        int tx = 0, ty = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (t == map[i][j]) {
                    ty = i + 1;
                    tx = j + 1;
                }
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }
        sb.append(ty + " " + tx);
        System.out.println(sb.toString());
    }


}
