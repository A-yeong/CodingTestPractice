class PG_representation_of_numbers {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i * (i - 1) / 2 < n; i++) {
            int temp = n - (i * (i - 1)) / 2;
            if(temp % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}