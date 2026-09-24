class Solution {
    int[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new int[s.length()+1];
        return helper(s,wordDict,0);
    }
    public boolean helper(String s,List<String> wordDict,int index){
        if(index==s.length()){
            return true;
        }
        if(memo[index]!=0){
            return memo[index] == -1 ? false : true;
        }
        for(String word:wordDict){
            if(index+word.length()<=s.length() && s.substring(index,index+word.length()).equals(word)){
                if(helper(s,wordDict,index+word.length())){
                    memo[index]= 1;
                    return true;
                }
            }
        }
        memo[index]= -1;
        return false;
    }
}