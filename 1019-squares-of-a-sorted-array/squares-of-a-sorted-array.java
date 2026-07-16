class Solution {
    public int[] sortedSquares(int[] nums) {
  
       int n = nums.length;
       int[] res = new int[n];

       int i = 0;
       int j = n-1;
       int k = n-1;

       while(i<=j){

       int Lsquare = nums[i]*nums[i];
       int Rsquare = nums[j]*nums[j];

        if(Lsquare > Rsquare){
            res[k] = Lsquare;
            i++;
        }
        else{
            res[k] = Rsquare;
            j--;
        }
        k--;
       }
       return res;
    }
}