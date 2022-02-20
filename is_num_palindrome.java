

class Solution {
    //function that checks whether a number is palindrome
    public boolean isPalindrome(int x) {
        int temporary= x;    
        int remainder= 0;
        int summation= 0;
        while(x>0){    
           remainder=x%10;  
           summation=(10*summation)+remainder;    
           x=x/10;    
  }    
      if(temporary==summation){
          return true;
      } else {
          return false;
      }
         
        
}  
}  