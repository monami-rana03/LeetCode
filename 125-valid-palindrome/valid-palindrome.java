class Solution {
    public boolean isPalindrome(String s) {
    //    String m="";
    //     //int j;
    //     for(int i=0;i<s.length();i++){
    //         if(s.codePointAt(i)>=65 && s.codePointAt(i)){
    //             m+=s.charAt(i);
    //         }
    //     }
        //System.out.println(m);
        int j=0;
        String p=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int c=p.length()/2;
        while(j<c){
            if(p.charAt(j)!=p.charAt(p.length()-1-j)){
                
                return false;
            }
            j++; 
        }
        return true;
    }
}