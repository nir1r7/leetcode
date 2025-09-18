class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int zeroCounter = 0;
        int totalProduct = 1;

        for (int i = 0; i < n; i++){
            int num = nums[i];

            if (num != 0) totalProduct *= num;
            else zeroCounter++;
        }

        for (int i = 0; i < n; i++){
            if (zeroCounter > 0 && (nums[i] != 0 || zeroCounter > 1)) answer[i] = 0;
            else if (zeroCounter == 1) answer[i] = totalProduct;
            else answer[i] = totalProduct/nums[i];
        }

        return answer;
    }
}