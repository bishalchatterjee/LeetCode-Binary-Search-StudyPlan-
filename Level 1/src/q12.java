import java.util.Arrays;

public class q12 {
    //167. Two Sum II - Input Array Is Sorted

    //Un-Optimised
    static int[] twoSumUsingBinarySearch(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = Arrays.binarySearch(nums, i + 1, n, target - nums[i]);
            if (j >= 0) {
                return new int[]{ i + 1, j + 1 };
            }
        }
        return new int[]{ -1, -1 };
    }

    public static void main(String[] args) {

    }
}


//T.C - O(n log n)
//S.C - O(1)

/*
Optimised
Two-Pointer approach

//T.C - O(n)
//S.C - O(1)

        static int[] twoSum(int[] nums, int target) {
            int l = 0, r = nums.length - 1;

            while (nums[l] + nums[r] != target) {
                if (nums[l] + nums[r] < target) l++;
                else r--;
            }

            return new int[] {l+1, r+1};
        }
    }
 */