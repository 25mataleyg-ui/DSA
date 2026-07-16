class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        if(n==0){
            return 0;
        }

        while(j<n){
            if(nums[i]!=nums[j]){
                 i++;
                nums[i]=nums[j];
               
            }
            j++;
        }
        return i + 1;
    }
}