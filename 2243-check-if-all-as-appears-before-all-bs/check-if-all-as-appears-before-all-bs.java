class Solution {
    public boolean checkString(String s) {
        boolean f=false;
        for(int c:s.toCharArray()){
            if(c=='b'){
                f=true;
            }else if(c=='a' && f){
                return false;
            }
        }
        return true;
    }
}