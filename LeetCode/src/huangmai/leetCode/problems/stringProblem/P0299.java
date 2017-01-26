package huangmai.leetCode.problems.stringProblem;

import java.util.Arrays;

public class P0299 {
    public String getHint(String secret, String guess) {
        int l = secret.length();
        int a = 0, b = 0;
        int[] sc = new int[10];
        int[] gc = new int[10];
        Arrays.fill(sc, 0);
        Arrays.fill(gc, 0);
        for(int i = 0; i < l; i ++){
            if(secret.charAt(i) == guess.charAt(i)){
                a ++;
            }else{
                sc[secret.charAt(i) - '0'] ++;
                gc[guess.charAt(i) - '0'] ++;
            }
        }
        for(int i = 0; i < 10; i ++){
            b += Integer.min(sc[i], gc[i]);
        }
        return "" + a + "A" + b + "B";
    }
}
