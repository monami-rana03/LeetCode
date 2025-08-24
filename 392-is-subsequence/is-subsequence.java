class Solution {
    public boolean isSubsequence(String s, String t) {
        var strlen= t.length();
        var sublen=s.length();
        if(sublen>strlen){
            return false;
        }
        else{
            int j=0;
            for(int i=0;i<strlen && j<sublen;i++){
                if(t.charAt(i)==s.charAt(j)){
                    j++;
                }
            }
            if(j==sublen){
                return true;
            }
            else{
                return false;
            }
        }
    }
}