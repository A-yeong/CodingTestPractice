package greedy;

public class change {
    public static void main(String[] args) {
        int N = 1260;
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for(int i = 0; i < coinTypes.length; i++){
            int coin = coinTypes[i];
            count += N / coin;
            N %= coin;
        }

        System.out.println(count);
    }
}
