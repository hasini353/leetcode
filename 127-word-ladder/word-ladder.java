class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> ws=new HashSet<>(wordList);
        if(!ws.contains(endWord)){
            return 0;
        }
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        Set<String> s=new HashSet<>();
        s.add(beginWord);
        int l=1;
       
       while(!q.isEmpty()){
           int sz=q.size();
           for(int i=0;i<sz;i++){
            String cw=q.poll();
             char[] c=cw.toCharArray();
             for(int j=0;j<c.length;j++){
                char oc=c[j];
                for(char k='a';k<='z';k++){
                    c[j]=k;
                    String nw=new String(c);
                    if(nw.equals(endWord)){
                        return l+1;
                    }
                    if(ws.contains(nw) && !s.contains(nw)){
                       s.add(nw);
                       q.offer(nw);
                    }

                }
                c[j]=oc;
             }
           }
           l++;
       }
       return 0;
    }
}

