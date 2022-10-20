public class q6 {
    //69. Sqrt(x)

    static int findSqrt(int n){
        int low=1; //skipping 0
        int high=n;
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=n/mid) {
                low = mid + 1;
                ans=mid;
            }
            else
                high=mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(4));
    }

}


//T.C - O(log n)
//S.C - O(1)