// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0,digit=0;
     
        while(n>0){
           int temp=n%10;
            sum += temp;
            n=n/10;
        }
          int originalSum = sum;
        while(sum>0){
            int temp=sum%10;
           digit=temp+digit*10;
            sum=sum/10;
        }
        if(originalSum==digit){
            return true;
        }else{
            return false;
        }
    }
}