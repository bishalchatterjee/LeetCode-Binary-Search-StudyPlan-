public class q2 {
    //374. Guess Number Higher or Lower


/*
GuessGame is api based driver code for this question

public class Solution extends GuessGame {
    public int guessNumber(int n) {
    int low = 1;
    int high = n;

    while (low <= high) {

        int mid = low + (high - low) / 2;

        if (guess(mid) == 1) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return low;
}
}


 */
}

//T.C - O(log n)   //BinarySearch is also known as half-interval search OR logarithmic search
//S.C - O(1)