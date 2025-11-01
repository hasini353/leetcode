class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res =new int[2];
   /*     HashMap<Integer,Integer> tem=new HashMap<>();
        for(int c:nums){
            tem.put(c,tem.getOrDefault(c,0)+1);
        }
       int i = 0; 
        for (int key : tem.keySet()) {
            if (tem.get(key) == 2) {
                res[i++] = key;  
            }
        }*/
        int i=0;
    HashSet<Integer> tem=new HashSet<>();
    for(int c:nums){
        if(tem.contains(c)) res[i++]=c;
        else tem.add(c);
    }

        return res;
    }
}