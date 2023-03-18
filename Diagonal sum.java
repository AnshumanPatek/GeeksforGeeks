class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        // code here
        int sum=0;
        for (int i = 0 ; i < matrix.length;i++){
     
     
      for (int j =0;j<matrix.length;j++){
           if(i==j){
               sum = sum + matrix[i][j];
           }
           if(i+j==matrix.length-1){
               sum = sum + matrix[i][j];
           }
       }
        }
     
        return sum;
    }
}
