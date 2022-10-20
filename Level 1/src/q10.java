public class q10 {
    //441. Arranging Coins

    //Optimised
    static int arrangeCoins(int n) {
        long left = 0; // we use "long" because we may get an integer overflow
        long right = n;
        while(left <= right){
            long pivot = left + (right - left) / 2;
            long coinsUsed = pivot * (pivot + 1)/2;
            if(coinsUsed == n){
                return (int)pivot;
            }
            if(n < coinsUsed){
                right = pivot-1;
            }
            else{
                left = pivot + 1;
            }
        }
        return (int)right; // cast as an "int" because it was initiliazed as a "long"
    }

    public static void main(String[] args) {
        int n=5;

        System.out.println(arrangeCoins(n));
    }
}
//T.C - O(log n)
//S.C - O(1)


/*
Un-Optimised

//T.C - O(n)
//S.C - O(1)


public class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        while(n > 0){
            i+=1;
            n-=i;
        }

        return n==0 ? i : i-1;

    }
}
*/


