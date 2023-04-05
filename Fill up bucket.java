class Solution{
    public int totalWays(int n, int[] capacity) {
        // code here
        Arrays.sort(capacity);

        

        long answer = 1;

        long M = 1000000007;

        for(int i=0; i<capacity.length; i++)

        {

            answer = (answer * (capacity[i]-i))%M;

        }

        

        return (int)answer;
    }
}
