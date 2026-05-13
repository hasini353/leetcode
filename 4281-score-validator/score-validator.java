class Solution {
    public int[] scoreValidator(String[] events) {
        int s=0;
        int cnt=0;
       int i=0;
       while(cnt<10 && i<events.length){
        if(events[i].equals("W")){
            cnt++;
            i++;
        }else if(events[i].equals("WD") || events[i].equals("NB")){
            s++;
            i++;
        }else{
            s+=Integer.parseInt(events[i]);
            i++;
        }
       }
        return new int[]{s,cnt};
    }
}