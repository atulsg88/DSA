class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOcc=-1;
        int lastOcc=-1;
        int right=nums.length-1;
        int left=0;

        // find First occurance
        while(left<=right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                firstOcc=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        left=0;
        right=nums.length-1;
// find last occurance
        while(left<=right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                lastOcc=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return new int[]{firstOcc,lastOcc};
    }
}