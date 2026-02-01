class Solution {
    public int search(int[] nums, int target) {
        int total = nums.length;
        int left = 0, right = total;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[total - 1]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        if(target <= nums[total - 1]){
            right = total;
        }
        else {
            right = left;
            left = 0;
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        if(left == total || nums[left] != target) return -1;
        return left;
    }
}