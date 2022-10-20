public class q14 {
    //1351. Count Negative Numbers in a Sorted Matrix

        static int countNegatives(int[][] grid) {
            int res = 0;
            for(int[] row : grid){
                res += binarySearch(row);
            }
            return res;
        }

        static int binarySearch(int[] row){
            int low = 0, high = row.length;
            while(low < high){
                int mid = low + (high - low)/2;
                if(row[mid] < 0)
                    high = mid;
                else
                    low = mid + 1;
            }
            return row.length - low;
        }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};

        System.out.println(countNegatives(grid));
    }
}


//T.C - O(nlogn) //n-->row.length
//S.C - O(1)