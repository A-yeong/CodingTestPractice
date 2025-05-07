package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4659 {
    static String str;
    static String[] vowels = new String[]{"a", "e", "i", "o", "u"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            str = br.readLine();
            if(str.equals("end"))
                break;

            if(!containVowel() || !threeVowel() || !treeCons() || !continuous())
                sb.append("<").append(str).append("> is not acceptable.\n");
            else
                sb.append("<").append(str).append("> is acceptable.\n");
        }

        System.out.println(sb);
    }

    private static boolean containVowel() {
        for (int i = 0; i < 5; i++) {
            if(str.contains(vowels[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean threeVowel() {
        for (int i = 2; i < str.length(); i++) {
            if (checkVowel(str.charAt(i - 2)) && checkVowel(str.charAt(i - 1)) && checkVowel(str.charAt(i)))
                return false;
        }
        return true;
    }

    private static boolean treeCons() {
        for (int i = 2; i < str.length(); i++) {
            if (!checkVowel(str.charAt(i - 2)) && !checkVowel(str.charAt(i - 1)) && !checkVowel(str.charAt(i)))
                return false;
        }
        return true;
    }

    private static boolean continuous() {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != 'e' && str.charAt(i) != 'o'){
                if(str.charAt(i - 1) == str.charAt(i))
                    return false;
            }
        }
        return true;
    }

    private static boolean checkVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }
}
