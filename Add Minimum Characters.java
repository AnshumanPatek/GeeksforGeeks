class Solution
{
	public static int addMinChar(String str){
		//code here
		  int res = 0,l=0,r=str.length()-1;
        while(l <= r){
            if(str.charAt(l++) != str.charAt(r--)){
                res++;
                l=0;
                r = str.length() - 1 - res;
            }
        }
        return res;
	}
}
