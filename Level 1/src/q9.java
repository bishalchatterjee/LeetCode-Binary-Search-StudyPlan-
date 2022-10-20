import java.lang.reflect.Array;
import java.util.Arrays;

public class q9 {
    //34. Find First and Last Position of Element in Sorted Array
        static int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            result[0] = findFirst(nums, target);
            result[1] = findLast(nums, target);
            return result;
        }

        static int findFirst(int[] nums, int target){
            int idx = -1;
            int start = 0;
            int end = nums.length - 1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(nums[mid] >= target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                if(nums[mid] == target) idx = mid;
            }
            return idx;
        }

        static int findLast(int[] nums, int target){
            int idx = -1;
            int start = 0;
            int end = nums.length - 1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(nums[mid] <= target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
                if(nums[mid] == target) idx = mid;
            }
            return idx;
        }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}



//T.C - O(log n)
//S.C - O(1)