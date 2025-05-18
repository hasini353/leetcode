class Solution {
    public int[] searchRange(int[] nums,int target) {
        int start=find(nums, target, true);
        int end=find(nums, target, false);
        return new int[] {start, end};
    }

    private int find(int[] nums,int target,boolean findStart) {
        int low=0,high=nums.length-1,ans=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (nums[mid]<target) {
                low=mid+1;
            } else if (nums[mid]>target) {
                high=mid-1;
            } else {
                ans=mid;
                if (findStart) high=mid-1;
                else low=mid+1;
            }
        }
        return ans;
    }
}
