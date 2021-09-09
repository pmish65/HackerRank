import java.util.ArrayList;
import java.util.List;

public class Result {
	public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<100;i++) {
        	list.add(i,0);
        }
        for(int ele:arr) {
        	list.set(ele,list.get(ele)+1);
        }
        return list;
    }

}
