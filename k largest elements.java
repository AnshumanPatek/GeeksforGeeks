class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
    
    int[] a=new int[k];

        Arrays.sort(arr);

        int x=0;

        int i=n-1;

            while(k>0 && i>=0 )

            {

                k--;

                a[x++]=arr[i--];

            }

      return a;

    }
}
