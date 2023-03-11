class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int cnt = 0;
        int ans = Integer.MIN_VALUE;
        int st = 0;
        int en = 0;

        while (en < arr.length()) {
            while (cnt > m) {
                if (arr.charAt(st) == 'O') {
                    cnt--;
                }
                st++;
            }

            if (arr.charAt(en) == 'O') {
                cnt++;
            }

            if (cnt <= m) {
                ans = Math.max(ans, en - st + 1);
            }
            en++;
        }

        return ans;
    }
}
