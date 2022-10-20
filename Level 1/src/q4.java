public class q4 {
  // 852. Peak Index in a Mountain Array

    static int peakIndexInMountainArray(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1])
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
//        int[] nums = {0,10,5,2};
        int[] nums = {0,2,1,0};

        System.out.println(peakIndexInMountainArray(nums));
    }
}


//T.C - O(log n)
//S.C - O(1)