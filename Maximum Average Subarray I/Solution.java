class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double dub_k = k;
        double[] avgs = new double[n - k + 1];

        for (int i = 0; i < k; i++){
            avgs[0] += nums[i];
        }
        avgs[0] /= dub_k;

        for (int i = 1; i < n-k+1; i++){
            avgs[i] = avgs[i-1] + (nums[i + k - 1] - nums[i-1])/dub_k;
        }

        double maxAvg = Integer.MIN_VALUE;
        for (double avg : avgs){
            if (avg > maxAvg){
                maxAvg = avg;
            }
        }

        return maxAvg;
    }
}