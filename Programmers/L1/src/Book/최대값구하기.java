package Book;

import java.util.Scanner;

public class 최대값구하기 {
    public static final int MAX_N = 100;

    public static int[] arr = new int[MAX_N];

    // a번째 까지 인덱스의 숫자 중에 가장 큰 값을 반환합니다.
    public static int maxValue(int a) {
        if (a == 0)
            return arr[0];

        int max = Math.max(maxValue(a - 1), arr[a]);
        System.out.println("max = " + max);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print(maxValue(n - 1));
    }
}
