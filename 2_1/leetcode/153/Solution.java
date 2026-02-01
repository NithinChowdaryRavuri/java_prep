class Solution {
    public int findMin(int[] nums) {
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

        return nums[left];
    }
}