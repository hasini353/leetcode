class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int cnt=0;
        boolean tem=false;
        for(int n:map.values()){
        if(n%2==0) cnt+=n;
        else {
            cnt+=n-1;
            tem=true;
        }
        
        }
        if(tem) cnt+=1;
        return cnt;
    }
}