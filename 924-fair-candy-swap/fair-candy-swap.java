class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumalice=0;
        int sumbob=0;
        for(int candy : aliceSizes){
            sumalice +=candy;
        }
        for(int candy : bobSizes){
            sumbob += candy;
        }
        int diff = (sumalice - sumbob) /2;
        HashSet<Integer> ac=new HashSet<>();
        for(int candy : aliceSizes){
            ac.add(candy);
        }
        for(int candy : bobSizes){
            if(ac.contains(candy+diff)){
                return new int[] {candy+diff, candy};
            }
        }
             return new int[0];
    }
}