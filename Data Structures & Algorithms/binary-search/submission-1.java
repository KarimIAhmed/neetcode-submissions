class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int medium=(start+end)/2;
            if(nums[medium]==target){
                return medium;
            }
            else if(nums[medium]>target){
               end=medium-1;
            }
            else{
                start=medium+1;
            }
        }
        return nums[start]==target ? start : -1;
    }
}
