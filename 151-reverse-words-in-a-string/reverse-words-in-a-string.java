class Solution {
    public String reverseWords(String s) {
        StringBuilder m=new StringBuilder();
        String[] n=s.trim().split("\\s+");
        for(int i=n.length-1;i>=0;i--){
            m.append(n[i]);
            if(i!=0){
                m.append(" ");
            }
        }
        return m.toString();
    }
}