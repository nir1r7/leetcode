class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int largestArea = 0;
        int l = 0, r = n-1;

        while (l < r){
            int heightL = height[l];
            int heightR = height[r];

            int smaller = heightL < heightR ? heightL : heightR;
            int currArea = smaller*(r - l);

            if (currArea > largestArea) largestArea = currArea;

            if (smaller == heightL){
                l++;
            }
            else{
                r--;
            }
        }       

        return largestArea;
    }
}