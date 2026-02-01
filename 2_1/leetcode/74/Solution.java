class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            int[] values = matrix[i];
            if(values[0] > target) {
                break;
            }
            if(values[0] <= target && values[cols - 1] >= target){
                int left = 0, right = cols;

                while(left < right){
                    int mid = left + (right - left) / 2;
                    if(values[mid] < target) {
                        left = mid + 1;
                    }
                    else{
                        right = mid;
                    }
                }

                if(left == cols || values[left] != target){
                    return false;
                }
                return true;
            }
        }

        return false;
    }
}