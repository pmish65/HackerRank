
public class Solution {
	public static int superDigit(String n, int k) {

		long sum = 0;
		long size = n.length();
		for (int i = 0; i < size; i++) {
			sum = sum + Integer.parseInt(String.valueOf(n.charAt(i)));

		}
		return helperFunction(String.valueOf(sum * k));

	}

	public static int helperFunction(String n) {
		if (Long.parseLong(n) < 10) {
			return Integer.parseInt(n);
		}
		long sum = 0;
		long size = n.length();
		for (int i = 0; i < size; i++) {
			sum = sum + Integer.parseInt(String.valueOf(n.charAt(i)));

		}
		return helperFunction(String.valueOf(sum));
	}
}
