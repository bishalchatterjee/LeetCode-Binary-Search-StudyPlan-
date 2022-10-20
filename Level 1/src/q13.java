import java.util.Arrays;

public class q13 {
    //1608. Special Array With X Elements Greater Than or Equal X

    //Un-Optimised
    static int specialArrayUsingBinarySearch(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            int low = 0, high = nums.length;
            while(low < high){
                int mid = low + (high - low) / 2;
                if(nums[mid] >= i) high = mid;
                else low = mid + 1;
            }
            if((nums.length - low) == i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={3,5};

        System.out.println(specialArrayUsingBinarySearch(nums));
    }

}
//T.C - O(n log n) // O(n log n) for sorting ans O(long n) for binary search
//S.C - O(log n) // as arrays-sort implements quick sort internally which has a space complexity of O(log n)


/*
Optimised
T.C - O(n)
S.C - O(1)

 static int specialArrayWithoutBinarySearch(int[] nums) {
        int[] count = new int[1001];
        for (int num : nums) {
            count[num]++;
        }
        int number = nums.length;
        // the size of nums array is 100 at most
        for (int i = 0; i <= 100; i++) {
            if (number == i) {
                return i;
            }
            number -= count[i];
        }
        return -1;
    }

 */