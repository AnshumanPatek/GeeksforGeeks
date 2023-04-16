class Solution {
    public static long solve(int N, int[] A, int[] B) {
        // code here
              int sumA=0;
        int sumB=0;
        for(int i=0;i<N;i++)
        {
           sumA += A[i];
           sumB += B[i];
        }
        if(sumA != sumB)
            return -1;
        
        ArrayList<Integer> oddA=new ArrayList<>();
        ArrayList<Integer> evenA=new ArrayList<>();
        ArrayList<Integer> oddB=new ArrayList<>();
        ArrayList<Integer> evenB=new ArrayList<>();
        for(int i=0; i<A.length; i++)
        {
            if(A[i]%2==0)
                evenA.add(A[i]);
            else
                oddA.add(A[i]);
                
            if(B[i]%2==0)
                evenB.add(B[i]);
            else
                oddB.add(B[i]);
        }
        if(oddA.size() != oddB.size() || evenA.size() != evenB.size())
            return -1;
            
        Collections.sort(oddA);
        Collections.sort(evenA);
        Collections.sort(oddB);
        Collections.sort(evenB);
        
        long count=0;
        for(int i=0; i<oddA.size(); i++)
        {
            count += Math.abs(oddA.get(i) - oddB.get(i))/2;
        }
        for(int i=0; i<evenA.size(); i++)
        {
            count += Math.abs(evenA.get(i) - evenB.get(i))/2;
        }
        return count/2;
    }
}
