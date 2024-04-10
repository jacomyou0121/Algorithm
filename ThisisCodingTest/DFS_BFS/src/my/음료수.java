package my;

import java.util.Scanner;

public class 음료수 {
    public static int[][] graph = new int[1000][1000];
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }


        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i,j)) {
                    res+=1;
                }
            }
        }

        System.out.println(res);
    }

    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
            // 현재 노드를 아직 방문하지 않았다면
            if (graph[x][y] == 0) {
                // 해당 노드 방문 처리
                graph[x][y] = 1;
                // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
                dfs(x - 1, y);
                dfs(x, y - 1);
                dfs(x + 1, y);
                dfs(x, y + 1);
                return true;
            }
            return false;
    }
}
