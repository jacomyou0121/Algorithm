package binary;

import java.util.Arrays;

public class 입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        solution(n, times);
    }

    private static long solution(int n, int[] times) {
        Arrays.sort(times);

        long left = 1;
        // 가장 오래 걸리는 심사관이 모든 인원을 처리하는 경우
        long right = (long) times[times.length - 1] * 7;
        long answer = right;
        while (left <= right) {
            long mid = (left + right) / 2;
            long total = 0;
            for (int time : times) {
                total += mid / time;
            }
            if (total >= n) {
                answer = Math.min(answer, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return answer;
    }
}
