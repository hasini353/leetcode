class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        HashMap<Character,String> ctw=new HashMap<>();
        HashMap<String,Character> wtc=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=word[i];
            if(ctw.containsKey(c)){
              if(!ctw.get(c).equals(w)){
                return false;
              }
            }else{
                if(wtc.containsKey(w)){
                    return false;
                }
                ctw.put(c,w);
                wtc.put(w,c);
            }
        }
    return true;
    }
}