import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		System.out.println(Solution.twoArrays(5, list, list1));

	}

}
