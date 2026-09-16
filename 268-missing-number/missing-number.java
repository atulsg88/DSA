class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        while(i<=n){
            if(!checknum(i,nums)){
                return i; 
            }
            i++;
        }
        return -1;
    }

    public static boolean checknum(int target, int nums[]){
        int right=nums.length-1;
        int left=0;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return true;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}