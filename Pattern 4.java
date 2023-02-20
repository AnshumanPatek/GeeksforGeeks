
class Solution {

    void printTriangle(int n) {
        // code here
        int i = 1;
		while (i<=n) {
			int j = 1;
			while (j<=i) {
			System.out.print(i + " ");
				j++;}
			System.out.println();
			i++;
		}
    }
}
