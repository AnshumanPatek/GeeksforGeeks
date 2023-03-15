class Solution{
        public static long findHcf(long L,long B){

        long temp;

       while(B>0){

        temp=B;

        B=L%B;

        L=temp;

        }

        return L;

        

    }
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
           long area=L*B;

        List<Long> list =new ArrayList<>();

      

        long side=findHcf(L,B);

        long area2=side*side;

        long num=area/area2;

       list.add(num);

       list.add(side);

       return list;
    }
}
