class Solution
{
    int i = 0;
    public Node constructBTree(int pre[], int preM[], int n)
    {
         return util(pre, preM, n);
    }
    public Node util( int pre[], int preM[], int n)
    {
        if(i == n ) return null;
        int j = 0;
        for(;j<n;j++){
            if(preM[j] == pre[i]) break;
        }
         preM[j] = -1;
         Node root = new Node(pre[i++]);
        if(j == n-1 || preM[j+1] == -1)  return root;
        
         root.left = util( pre, preM, n);
         root.right = util( pre, preM, n);
         return root;
    }
    
}
