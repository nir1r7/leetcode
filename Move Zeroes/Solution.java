class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p1 = 0;

        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                nums[p1++] = nums[i];
            }
        }
        for (int i = p1; i < n; i++){
            nums[i] = 0;
        }
    }
}