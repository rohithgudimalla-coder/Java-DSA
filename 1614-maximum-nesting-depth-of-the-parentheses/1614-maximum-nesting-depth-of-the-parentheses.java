class Solution {
    public int maxDepth(String s) {
        int a=0;
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                a++;
                max=Math.max(max,a);
            }
            if(s.charAt(i)==')'){
                a--;
            }
        }
        return max;
    }
}