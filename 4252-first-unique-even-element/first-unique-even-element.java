class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int n:nums){
            s.put(n,s.getOrDefault(n,0)+1);
        }
    for(int n:nums){
        if(n%2==0 && s.get(n)==1){
            return n;
        }
    }
    return -1;
    }
}