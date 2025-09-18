class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        String ans = "";

        for (int i = 0; i < n; i++){
            if (!arr[n-i-1].equals("")){
                ans += " " + arr[n-i-1];
            }
        }

        return ans.substring(1);
    }
}