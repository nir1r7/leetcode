import java.util.*;

class Solution {
    Map<Integer, String> map = new HashMap<Integer, String>();
    String s;
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        map.put(0, "0");
        for (int i = 1; i <= n; i++){
            s = "";
            recur(i);
            map.put(i, s);
        }

        for (int i = 0; i <= n; i++){
            String str = map.get(i);
            for (int j = 0; j < str.length(); j++){
                ans[i] += str.charAt(j)-48;
            }
        }

        return ans;
    }

    public void recur(int x){
        if (x == 0) return;
        if (map.get(x) != null){
            s += map.get(x);
            return;
        }

        int r = Integer.valueOf(x) % 2;
        int q = Integer.valueOf(x)/2;

        s += "" + r;

        recur(q);
        return;
    }
}