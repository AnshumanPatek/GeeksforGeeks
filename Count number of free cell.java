

class Solution {
    long[] countZero(int N, int K, int[][] arr){
        // code here
        long freeCells = N*N;
        boolean[] filledRows = new boolean[N];
        boolean[] filledCols = new boolean[N];
        int rowCount = 0 , colCount = 0;
        long[] ans = new long[K];
        
        for(int i = 0 ; i < K ; i++){
            
            int row = arr[i][0];
            int col = arr[i][1];
            
            //if it is a new row to be filled
            if(!filledRows[row-1]){
                freeCells -= (N-colCount);
                filledRows[row-1] = true;
                rowCount++;
            }
            
            //if it is a new col to be filled
            if(!filledCols[col-1]){
                freeCells -= (N-rowCount);
                filledCols[col-1] = true;
                colCount++;
            }
            
            //remaining freeCells after filling row and col
            ans[i] = freeCells;
        }
        return ans;
    }
}
