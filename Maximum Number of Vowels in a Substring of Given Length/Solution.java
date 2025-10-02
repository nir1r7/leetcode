class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        char[] str = s.toCharArray();
        int[] arr = new int[n];

        for (int i = 0; i < k; i++){
            if (isVowel(str[i])) arr[0]++;
        }

        int p = k;
        for (int i = 1; i < n-k+1; i++){
            arr[i] = arr[i-1];
            if (isVowel(str[p])){
                arr[i]++;
            }
            if (isVowel(str[i-1])){
                arr[i]--;
            }
            p++;
        }

        int max = 0;
        for (int num : arr){
            if (num > max) max = num;
        }

        return max;
    }

    public boolean isVowel(char c){
        switch(c){
            case 97: case 101: case 105: case 111: case 117: return true;
        }
        return false;
    }
}