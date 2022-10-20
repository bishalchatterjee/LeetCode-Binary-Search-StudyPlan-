public class q7 {
    //744. Find Smallest Letter Greater Than Target

        static char nextGreatestLetter(char[] letters, char x) {
        int n = letters.length;

        //hi starts at 'n' rather than the usual 'n - 1'.
        //It is because the terminal condition is 'lo < hi' and if hi starts from 'n - 1',
        //we can never consider value at index 'n - 1'
        int low = 0, high = n;

        //Terminal condition is 'lo < hi', to avoid infinite loop when target is smaller than the first element
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] <= x)
                low=mid+1;
            else
                high = mid;                
        }

        //Because lo can end up pointing to index 'n', in which case we return the first element
        return letters[low % n];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters,target));
    }

}



//T.C - O(log n)
//S.C - O(1)