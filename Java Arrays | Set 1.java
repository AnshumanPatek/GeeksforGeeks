class Compute
{
    String average(int A[], int N)
    {
         float sum = 0;
       for(int i = 0;i<N;i++){
           sum=sum+A[i];
       }
       float avg = sum / N;
       String value = String.format("%.2f", avg);
       return value;
    }
}
