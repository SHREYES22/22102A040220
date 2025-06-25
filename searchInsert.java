class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                index=i;
                break;
    
            }
            else if(nums[i]>target){
                index=i;
                break;
            }
        }
        if(index==-1){
            index=nums.length;
        }
        return index;

    }
}
