public class q5 {
    //367. Valid Perfect Square

    static boolean isPerfectSquareUsingBinarySearch(int num) {
        int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2; // to avoid overflow incase (left+right)>2147483647
            int res = num / mid, remain = num % mid;
            if (res == mid && remain == 0) return true; // check if mid * mid == num
            if (res > mid) { // mid is small -> go right to increase mid
                left = mid + 1;
            } else {
                right = mid - 1; // mid is large -> to left to decrease mid
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquareUsingBinarySearch(num));
    }
}


//T.C - O(log n)
//S.C - O(1)


