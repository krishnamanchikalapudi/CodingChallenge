package solutions.codesignal.prescreen;
/**
 * Given a string s, task is to count the number of ways to splitting s into three non-empty parts a, b, and c (s=a+b+c) in such a way that a+b, b+c, and c+a are all different strings.
 * 
 * Example:
 * Input: s='xzxzx'
 * Output: solution(s) = 5.
 * Explanation:
 * 1. a='x', b='z' and c='xzx', then a+b = 'xz', b+c='zxzx' and c+a='xzxx'
 * 2. a='x', b='zx' and c='zx', then a+b = 'xzx', b+c='zxzx' and c+a='zxx'
 * 3. a='x', b='zxz' and c='x', then a+b = 'xzxz', b+c='zxzx' and c+a='xx'
 * 4. a='xz', b='zx' and c='xx', then a+b = 'xzzx', b+c='zxxx' and c+a='xxxz'
 * 5. a='xz', b='xz' and c='x', then a+b = 'xzxz', b+c='xzx' and c+a='xxz'
 * 6. a='xzx', b='z' and c='x', then a+b = 'xzxz', b+c='zx' and c+a='xxzx'
 * 
 * Example 2:
 * Input: xzy
 * Output: 1
 * 
 * Example 3:
 * Input: xxx
 * Output: 0
 * 
 * Example 4:
 * Input: xzxzxzxzxz
 * Output: 30
 * 
 * Example 5:
 * Input: xxxxxxxxxx
 * Output: 24
 * 
 * Example 6:
 * Input: xyzxyzxyzx
 * Output: 35
 * 
 * Example 7:
 * Input: xzxzxxzzxx
 * Output: 36
 * 
 * Example 8:
 * Input: gggggggggggggggggggggggggggggg
 * Output: 366
 * 
 * Example 9:
 * Input: gfgfgfgfgfgfgfgfgfgfgfgfgfgfgf
 * Output: 387
 * 
 */
public class WaysOfSplitting {
    public int solution(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String a = s.substring(0, i);
                String b = s.substring(i, j);
                String c = s.substring(j);

                if (!(a+b).equals(b+c) && !(b+c).equals(c+a) && !(c+a).equals(a+b)){
                    count++;
                } // if
            } // for: j
        } // for: i
        return count;
    }
}
