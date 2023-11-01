package L1;

public class _약수의개수와덧셈 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int result = solution(left, right);
        System.out.println(result); // 결과 출력
    }

    private static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; ++i){
            int count = 0;
            for(int j=1; j<=i; ++j)
                if(i%j == 0)
                    count++;

            if(count%2 == 0)
                answer += i;
            else
                answer -= i;
        }
        return answer;
    }
}
