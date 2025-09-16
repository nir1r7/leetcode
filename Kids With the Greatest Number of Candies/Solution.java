import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();

        int max = candies[0];
        for (int i = 1; i < n; i++){
            if (candies[i] > max) max = candies[i];
        }
        for (int i = 0; i < n; i++){
            if (candies[i] - max + extraCandies >= 0) result.add(true);
            else result.add(false);
        }

        return result;
    }
}