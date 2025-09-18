class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> t=new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            t.add(c);
        }
        String[] word=text.split(" ");
        int cnt=0;
        for(String w : word){
            boolean has=false;
            for(char wr : w.toCharArray())
            {
                if(t.contains(wr)){
                    has=true;
                    break;
                }
            }
            if(!has) cnt++;
        }
        return cnt;
    }
}