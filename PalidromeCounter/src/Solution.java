
public class Solution {
	public static void main(String[] args) {
		String s = "banana";
		int count=0;
		int size = s.length();
		int x=0;
		for(int i=1;i<size;i++) {
			for(int j=0;j<size-x;j++) {
				String p=s.substring(j, j+i);
				if(isPalidrom(p)) {
					System.out.println(p);
					count++;
				}
			}
			x++;
		}
		System.out.println(count);
	}
	 static boolean isPalidrom(String s) {
		 int left=0;
		 int right=s.length()-1;
		 while(left<right) {
			 if(s.charAt(left)==s.charAt(right)) {
				 left++;
				 right--;
			 }
			 else {
			 return false;
			 }
		 }
		 return true;
	}
}
