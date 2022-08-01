class Solution {
    public double myPow(double x, int n) {
        if(n==0 && x!=0){
            return 1;
        }
        
        if(n == 0 && x == 0 ) { 
            throw new ArithmeticException();
        }
        
        if(n<0 && x!=0){
            x=1/x;
            n=-n;
        }
        
        double mult=1.0;
        for(int i=0;i<n;i++){
            mult=mult*x;
        }
        
        return mult;
    }
}
