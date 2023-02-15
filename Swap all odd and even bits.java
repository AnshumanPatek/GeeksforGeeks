class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	            int x=n&0x55555555;//number with all odd bits as set

        int y=n&0xAAAAAAAA;//number with all even bits as set

        y=y>>1; //right shift even bits

        x=x<<1;//left shift odd bits

        return(x|y); //return combined result
	}
    
}
