import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(Solution.slidingWindow(list, 3));
		StringBuilder sb = new StringBuilder();
		sb.append("p");
		sb.append("i");
		sb.insert(0,"so");
		System.out.println(sb);
		
	}
}
