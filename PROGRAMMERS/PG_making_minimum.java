import java.util.*;

class PG_making_minimum
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < len; i++) {
            answer += A[len - 1 - i] * B[i];
        }

        return answer;
    }
}