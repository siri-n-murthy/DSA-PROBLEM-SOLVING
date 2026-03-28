public class LongestSubstring {
    
    public static int lengthOflongestSubstring(String s){
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(s.indexOf(s.charAt(right),left)<right){
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
