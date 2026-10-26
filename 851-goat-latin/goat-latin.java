class Solution {
    public String toGoatLatin(String sentence) {
        String[] s=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length;i++){
            String w=s[i];
            if(isvol(w.charAt(0))) res.append(w);
            else{
                res.append(w.substring(1));
                res.append(w.charAt(0));
            }  
            res.append("ma");  
            for(int j=0;j<=i;j++){
                res.append("a");
            }
            if(i!=s.length-1) res.append(" ");
        }
        return res.toString();
    }
    private boolean isvol(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}