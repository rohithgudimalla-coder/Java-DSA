class Solution {
    
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int m=0;
            int n1=nums[i];
        while(n1>0){
            m+=n1%10;
            n1=n1/10;
        }
            if(m==i){
                return i;
            }
        }
        return -1;
    }
}