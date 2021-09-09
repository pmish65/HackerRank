import java.util.Arrays;
import java.util.List;

public class Result {
	public static String gridChallenge(List<String> grid) {
		int size=grid.size();
		int length=grid.get(0).length();
        for(int i=0;i<size-1;i++) {
        	String s1=arrangeString(grid.get(i));
        	String s2=arrangeString(grid.get(i+1));
        	for(int j=0;j<length;j++) {
        		if(s1.charAt(j)>s2.charAt(j)) {
        			return "NO";
        		}
        	}
        }
        return "YES";

    }
	public static String arrangeString(String s) {
		int length = s.length();
		char[] c = new char[length];
		c=s.toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);
	}
}
