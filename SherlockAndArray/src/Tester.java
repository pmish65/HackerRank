import java.util.Arrays;
import java.util.List;

public abstract class Tester {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,4,1,1);
		System.out.println(Result.balancedSums(list));
	}

}
