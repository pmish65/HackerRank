
public class Result {
	public static String pangrams(String s) {
		String a= "abcdefghijkmlnopqrstuvwxyz";
		s=s.toLowerCase();
		int i=0;
		while(!a.isEmpty() && i<s.length()) {
			if(a.contains(String.valueOf(s.charAt(i)))) {
				int index = a.indexOf(s.charAt(i));
				a= a.substring(0, index) + a.substring(index + 1);  
			}
			i++;
		}
		if(a.isEmpty()) {
			return "panagram";
		}
		else {
			return "not panagram";
		}
	}
}
