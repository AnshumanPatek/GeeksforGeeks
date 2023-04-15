
class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(arr[0]);
        long ans=0;
        for(int i=1;i<n;i++){
            if(hs.contains(arr[i]))ans+=time[arr[i]-1];
            else ans++;
            hs.add(arr[i]);
        }
        return ans;
        
    }
}
