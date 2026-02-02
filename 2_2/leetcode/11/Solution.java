class Solution {
    public int maxArea(int[] height) {
        int result = 0, left = 0, right = height.length - 1;

        while(left < right){
            int curr_area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, curr_area);
            if(height[left] > height[right]) right -= 1;
            else left += 1;
        }

        return result;
    }
}