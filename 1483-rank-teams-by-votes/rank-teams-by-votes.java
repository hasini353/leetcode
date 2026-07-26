class Solution {
    public String rankTeams(String[] votes) {
        if(votes.length==1) return votes[0];
        int n=votes[0].length();
        Map<Character,int[]> mp=new HashMap<>();
        for(char c:votes[0].toCharArray()){
            mp.put(c,new int[n]);
        }
        for(String v:votes){
            for(int i=0;i<n;i++){
                char t=v.charAt(i);
                mp.get(t)[i]++;
            }
        }
        List<Character> tms=new ArrayList<>();
        for(char ch:votes[0].toCharArray()){
            tms.add(ch);
        }
        Collections.sort(tms,(a,b)->{
            int[] cnta=mp.get(a);
            int[] cntb=mp.get(b);
            for(int i=0;i<n;i++){
                if(cnta[i]!=cntb[i]){
                    return cntb[i]-cnta[i];
                }
            }
            return a-b;
        });
        StringBuilder ans=new StringBuilder();
        for(char ch:tms){
            ans.append(ch);
        }

        return ans.toString();

    }
}