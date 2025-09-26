import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;

        for (int num : nums){
            int complement = k - num;

            if (map.containsKey(complement) && map.get(complement) > 0) {
                map.put(complement, map.get(complement)-1);
                count++;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}