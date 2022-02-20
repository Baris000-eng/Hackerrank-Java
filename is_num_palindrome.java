

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

//2nd implementation to check whether a number is palindrome or not 
 public boolean isPalindromeVersion2(int x) {
       String str= Integer.toString(x);//convert to a string
       String s="";
       for(int i=str.length()-1;i>=0;i--){
           s+=str.charAt(i);
       }
       if(s.equals(str)){
           return true;
       } else {
           return false;
       }
        
}  

//3rd way to check whether a number is palindrome
public boolean isPalindrome(int x) {
       boolean isPalindrome=false;
       String str= Integer.toString(x);
       for(int i=str.length()-1;i>=0;i--){
           for(int j= 0; j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                  isPalindrome=true;
               }
           }
       }
       return isPalindrome; 
}

}  