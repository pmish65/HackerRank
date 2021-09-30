import java.util.ArrayList;
import java.util.List;

public class Result {
	 public static List<String> bomberMan(int n, List<String> grid) {
		 		List<String> list = new ArrayList<>();
		 		int size=grid.size();
		 		int length = grid.get(0).length();
		 		if(n==1) {
		 			return grid;
		 		}
		 		else if(n%2==0) {
		 			for(int i=0;i<size;i++) {
		 				String str="";
		 				for(int j=0;j<length;j++) {
		 					str=str+"0";
		 				}
		 				list.add(str);
		 			}
		 			return list;
		 		}
		 		else {
		 			for(int i=0;i<size;i++) {
		 				String str="";
		 				for(int j=0;j<length;j++) {
		 					if(grid.get(i).charAt(j)=='.') {
		 						str=str+"0";
		 					}
		 					else if(grid.get(i).charAt(j)=='0') {
		 						str=str+".";
		 						str.
		 					}
		 				}
		 			}
		 		}
		 		

		    }

}
