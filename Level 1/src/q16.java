import java.util.Arrays;
import java.util.PriorityQueue;

public class q16 {
    //1337. The K Weakest Rows in a Matrix

    static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int[] ans = new int[k];

        for (int i = 0; i < mat.length; i++) {
            pq.offer(new int[] {binarySearch(mat[i]), i});
            if (pq.size() > k)
                pq.poll();
        }

        while (k > 0)
            ans[--k] = pq.poll()[1];

        return ans;
    }

    static int binarySearch(int[] row) {
        int lo = 0;
        int hi = row.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (row[mid] == 1)
                lo = mid + 1;
            else
                hi = mid;
        }

        return lo;
    }

    public static void main(String[] args) {
       int[][] mat ={{1,1,0,0,0},
               {1,1,1,1,0},
               {1,0,0,0,0},
               {1,1,0,0,0},
               {1,1,1,1,1}};
        int k = 3;

        System.out.println(Arrays.toString(kWeakestRows(mat,k)));
    }
}

//T.C - O(nlogn)
//S.C - O(n)
