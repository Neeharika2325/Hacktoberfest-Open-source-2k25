class Solution {
    public int minOperations(String s) {
        int len=s.length(),i=0,ans=0;
        while(i<len){
            char ch=s.charAt(i);
            int c=(26-(ch-'a'))%26;
            ans=Math.max(ans,c);
            i++;
        }
        return ans;
    }
}
