class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code 
        int Area []=new int[3];
        Area[0] = L*W;
        Area[1] = (int)(0.5*B*H);
        Area[2]=(int) (3.14*(R*R));
        return Area;
    }
};
