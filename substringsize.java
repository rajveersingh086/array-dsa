package slidingwindow;

public class substringsize {
    public int countGoodSubstrings(String s) {
        int n= s.length();
        int count =0;
        for (int i=0;i<=n-3;i++){
            if(s.charAt(i)!=s.charAt(i+1) &&
             s.charAt(i) != s.charAt(i+2) &&
             s.charAt(i+1) !=s.charAt(i+2)){
                count++; 
            }
        }
        return count;
    }
}