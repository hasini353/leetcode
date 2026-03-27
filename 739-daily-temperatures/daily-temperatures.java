class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      /*  int[] l=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int cnt=0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    cnt=j-i;
                    break;
                }
            }
            l[i]=cnt;
        }
        return l; */
        int n=temperatures.length;
        int[] r=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int p=s.pop();
                r[p]=i-p;
            }
            s.push(i);
        }
        return r;
    }
}