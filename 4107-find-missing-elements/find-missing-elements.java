class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int mn=nums[0];
        int mx=nums[nums.length-1];
        List<Integer> rs=new ArrayList<>();
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        for(int i=mn;i<mx;i++){
            if(!s.contains(i)){
                rs.add(i);
            }
        }
       
        return rs;
    }
}