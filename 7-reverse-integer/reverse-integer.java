class Solution {
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            int d=x%10;
            x=x/10;
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 ||
               (result == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
            result=result*10+d;
        }
        return result; 
    }
}