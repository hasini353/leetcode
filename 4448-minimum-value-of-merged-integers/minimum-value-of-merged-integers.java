class Solution {
    public int minMergedInteger(int[] nums) {
       int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int i=0;
        while(i<n-1){
            int v1=0;
            if(nums[i+1]<10){
              v1=nums[i]*10 + nums[i+1];
            }else if(nums[i+1]<100){
              v1=nums[i]*100 + nums[i+1];
            }else if(nums[i+1]<1000){
              v1=nums[i]*1000 + nums[i+1];
            }else{
                v1=nums[i]*10000+nums[i+1];
            }
            ans=Math.min(ans,v1);
            i+=2;
        }
        return ans; 

     /*   int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i += 2) {
            int m= Integer.parseInt(String.valueOf(nums[i]) + nums[i + 1]);
            min = Math.min(min, m);
        }
        return min; */
    }
}