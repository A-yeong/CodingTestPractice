import java.lang.*;

class PG_next_big_number {
    public int solution(int n) {
        int answer = 0;

        String nBinary = Integer.toBinaryString(n);
        int nOneNum = oneNumber(nBinary);

        while(true) {
            n++;
            String nextBinary = Integer.toBinaryString(n);
            int nextOneNum = oneNumber(nextBinary);
            if(nOneNum == nextOneNum) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    private static int oneNumber(String str) {
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1')
                num++;
        }
        return num;
    }
}