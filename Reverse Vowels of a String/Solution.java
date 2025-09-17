
class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        boolean[] isVowel = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }
        char[] cars = s.toCharArray();
        int l = 0;
        int r = n-1;
        
        while (l < r){
            while (l < r && !isVowel[cars[l]]) l++;
            while (l < r && !isVowel[cars[r]]) r--;
            
            int temp = cars[l];
            cars[l] = cars[r];
            cars[r] = (char) temp;

            l++;
            r--;
        }

        return new String(cars);
    }
}