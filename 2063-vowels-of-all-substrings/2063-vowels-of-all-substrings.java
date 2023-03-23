class Solution {
    public long countVowels(String word) {
        long ans=0;
        char ch[]=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                ans+=(long)(ch.length-i)*(long)(i+1);
            }
        }
        return ans;
    }
}