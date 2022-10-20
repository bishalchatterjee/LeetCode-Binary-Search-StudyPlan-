public class q15 {
    //74. Search a 2D Matrix

    static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false; //if matrix is empty return false

        int n=matrix.length; //get number of rows
        int m=matrix[0].length; //get number of column

        int low=0; //low pointing to start element index of the matrix
        int high =(n*m)-1; // high pointing to last element index of the matrix

        while(low<=high){ //simple binary search
            int mid=(low+(high-low)/2); //get mid
            if(matrix[mid/m][mid % m]==target){   //matrix[mid/m][mid % m] gives the index of row and column of the current mid
                return true; //if found return true
            }
            if(matrix[mid/m][mid % m]< target){ //if the element at corresponding index of mid is less than target increase the low pointer
                low=low+1;
            }else{
                high=high-1; //else increase the right pointer
            }
        }
        return false;  //return false if not found
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        System.out.println(searchMatrix(matrix,target));
    }
}

//T.C - O(log n)
//S.C - O(1)
