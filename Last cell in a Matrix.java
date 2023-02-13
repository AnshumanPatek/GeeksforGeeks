
class Solution{
    
    
     static boolean withinBounds(int[][] matrix, int i, int j, int R, int C) {
        return i >= 0 && i < R && j >= 0 && j < C;
    }
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        String dir = "RIGHT";
    
        int i=0, j=0, prevRow = i, prevCol = j;
        while (withinBounds(matrix, i, j, R, C)) {
            prevRow = i; prevCol = j;
            if (matrix[i][j] == 0) {
                if ("UP".equals(dir)) {
                    i--;
                } else if ("RIGHT".equals(dir)) {
                    j++;
                } else if ("DOWN".equals(dir)) {
                    i++;
                } else if ("LEFT".equals(dir)) {
                    j--;
                }
            } else {
                if ("UP".equals(dir)) {
                    dir = "RIGHT";
                    matrix[i][j] = 0;
                    j++;
                } else if ("RIGHT".equals(dir)) {
                    dir = "DOWN";
                    matrix[i][j] = 0;
                    i++;       
                } else if ("DOWN".equals(dir)) {
                    dir = "LEFT";
                    matrix[i][j] = 0;
                    j--;
                } else if ("LEFT".equals(dir)) {
                    dir = "UP";
                    matrix[i][j] = 0;
                    i--;
                }
            }        
        }
        
        return new int[]{prevRow, prevCol};
    }
}
