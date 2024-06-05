import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * Author    : 전유진
 * Date      : 2024.06.03(월)
 * Runtime   : 192ms
 * Memory    : 18008KB
 * Algorithm : DFS
 */
public class  Main {

    static LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
    public static boolean[] visited;
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(sc.readLine()); // 컴퓨터의 수
        int link = Integer.parseInt(sc.readLine()); // 연결된 쌍의 수

        visited = new boolean[num + 1]; // 방문 배열 크기 설정
        for (int i = 0; i < num + 1; i++) {
            list.add(new LinkedList<>());
        }

        for (int i = 0; i < link; i++) {
            String[] split = sc.readLine().split(" ");
            int from = Integer.parseInt(split[0]);
            int to = Integer.parseInt(split[1]);
            list.get(from).add(to);
            list.get(to).add(from);
        }

        // 초기 방문 설정 및 DFS 호출
        visited[1] = true;
        dfs(1);
        System.out.println(cnt);

        sc.close();
    }

    private static void dfs(int start) {
        for (int i = 0; i < list.get(start).size(); i++) {
            Integer next = list.get(start).get(i);
            if (!visited[next]) {
                cnt++;
                visited[next] = true;
                dfs(next);
            }
        }
    }
}
