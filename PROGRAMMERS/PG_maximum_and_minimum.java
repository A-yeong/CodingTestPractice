
class PG_maximum_and_minimum {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < str.length; i++) {
            if(min > Integer.parseInt(str[i]))
                min = Integer.parseInt(str[i]);
            if(max < Integer.parseInt(str[i]))
                max = Integer.parseInt(str[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}