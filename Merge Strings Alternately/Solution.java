class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";

        int n = Math.min(word1.length(), word2.length());

        for (int i = 0; i < n; i++){
            merged += word1.charAt(i) + "" + word2.charAt(i);
        }
        merged += word1.substring(n);
        merged += word2.substring(n);

        return merged;
    }
}