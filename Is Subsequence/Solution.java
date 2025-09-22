class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int n2 = s.length();

        if (n2 == 0) return true;
        if (n2 > n) return false;

        int p = 0;
        for (int i = 0; i < n; i++){
            if (t.charAt(i) == s.charAt(p)){
                p++;
            }
            if (p == n2) return true;
        }
        return false;
    }
}