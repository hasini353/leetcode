class Solution {
    public String makeGood(String s) {
        Stack<Character> var=new Stack<>();
        for(char c:s.toCharArray()){
            if(!var.isEmpty() && Math.abs(var.peek()-c)==32){
                var.pop();
            }else var.push(c);
        }
        StringBuilder n=new StringBuilder();
        for(char c:var){
            n.append(c);
        }
        return n.toString();
    }
}