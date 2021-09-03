import java.util.List;

public class Result {
	public static int birthday(List<Integer> s, int d, int m) {
		int count=0;
		for(int i=0;i<=s.size()-m;i++) {
			int temp=0;
			for(int j=i;j<i+m;j++) {
				temp=temp+s.get(j);
				if(temp==d) {
					count++;
				}
			}
		}
		return count;
    }    

}
