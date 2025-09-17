class Solution {
    public String convert(String s, int numRows) {
        int l=s.length();
        if(numRows==1){
            return s;
        }
        String str="";
        int down=0;
        boolean cont=true;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        for(int i=0;i<l;i++){
            rows[down].append(s.charAt(i));
            if(down==0){
                cont=true;
            }
            else if(down==numRows-1){
                cont=false;
            }
            down+= cont ? 1:-1;

        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }
        return result.toString();
    }
}