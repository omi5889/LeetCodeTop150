package problems.arrays_strings;

public class P392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        int sindex = 0;
        int tindex = 0;
        while(tindex < t.length()) {
            if( t.charAt(tindex) == s.charAt(sindex)) {
                sindex++;
                if(sindex == s.length()) { return true; }
            }
            tindex++;
        }
        return false;
    }
}
