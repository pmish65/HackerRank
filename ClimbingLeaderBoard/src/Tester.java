import java.util.Arrays;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Integer> ranked = Arrays.asList(100,100,50,40,40,20,10);
		List<Integer> player = Arrays.asList(5,25,50,120);
		List<Integer> list = Solution.climbingLeaderboard(ranked, player);
		list.stream().forEach(System.out::println);
	}
}
