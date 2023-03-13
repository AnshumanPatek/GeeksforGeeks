class Solution
{
    public:
    int isPowerOfFour(unsigned int n)
    {
      // Your code goes here
      if (n==1){
          return 1;
      }
      if (n%4==0){
          for (int i = 1 ; i <=n ; i = i*4){
              
              if (i == n ){
                  return 1; 
              }
          }
      }
      return 0;
    }
};
