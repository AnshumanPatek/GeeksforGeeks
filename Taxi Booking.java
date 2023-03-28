class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
         int minmumTime = Integer.MAX_VALUE;
        for(int i=0; i< N;i++){
            int distance = Math.abs(pos[i]-cur);
            int Near = distance * time[i];
            minmumTime = Math.min(minmumTime,Near);
        }
        return minmumTime;
    }
}
  
