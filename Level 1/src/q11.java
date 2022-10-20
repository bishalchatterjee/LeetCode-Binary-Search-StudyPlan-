public class q11 {
    //1539. Kth Missing Positive Number


    static int findKthPositive(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] - mid <= k) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return left + k;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int k = 5;

        System.out.println(findKthPositive(nums,k));
    }
}

//T.C - O(log n)
//S.C - O(1)
