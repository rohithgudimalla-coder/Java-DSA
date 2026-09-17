class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        int idx=0;
        for(int i=0;i<arr[0];i++){
            nums[idx]=0;
            idx++;
        }
        for(int i=0;i<arr[1];i++){
            nums[idx]=1;
            idx++;
        }

        for(int i=0;i<arr[2];i++){
            nums[idx]=2;
            idx++;
        }
    }
}