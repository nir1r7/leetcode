class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) return 1;

        int curr = chars[0];
        int count = 1;
        int p = 0;

        for (int i = 1; i < n; i++){
            int c = (int) chars[i];

            if (c == curr){
                count++;
            }
            else{
                chars[p] = (char) curr;
                if (count > 1){
                    p++;
                    String str = Integer.toString(count);
                    for (int j = 0; j < str.length(); j++){
                        chars[p++] = str.charAt(j);
                    }
                    count = 1;
                    p--;
                }

                curr = c;
                p++;
            }
        }
        chars[p++] = (char) curr;
        if (count > 1){
            String str = Integer.toString(count);
            for (int j = 0; j < str.length(); j++)
                chars[p++] = str.charAt(j);
        }

        return p;
    }
}