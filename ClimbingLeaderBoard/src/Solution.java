import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player){
		 int r = ranked.size();
		 int p = player.size();
		 List<Integer> list=new ArrayList<>();
		 List<Integer> result = new ArrayList<>();
		 list.add(1);
		 for(int i=1;i<r;i++) {
			 if(ranked.get(i)==ranked.get(i-1)) {
				 list.add(list.get(i-1));
			 }
			 else {
				 list.add(list.get(i-1)+1);
			 }
		 }
		 for(int i=0;i<p;i++) {
			 if(player.get(i)==ranked.get(0) || player.get(i)>ranked.get(0)) {
				 result.add(1);
			 }
			 else if(player.get(i)<ranked.get(r-1)) {
				 result.add(list.get(r-1)+1);
			 }
			 else if(player.get(i)==ranked.get(r-1)) {
				 result.add(list.get(r-1));
			 }
			 else {
				 int x = BinarySearch(ranked, player.get(i));
				 result.add(list.get(x));
			 }
		 }
		 return result;
	 }
	 public static int BinarySearch(List<Integer> list,int key) {
		 int size = list.size();
		 int lo=0;
		 int hi=size-1;
		 while(lo<=hi) {
			 int mid=lo+(hi-lo)/2;
			 if(list.get(mid)==key) {
				 return mid;
			 }
			 if(list.get(mid)<key && list.get(mid-1)>key) {
				 return mid;
			 }
			 if(list.get(mid)>key && list.get(mid+1)<key) {
				 return mid-1;
			 }
			 if(list.get(mid)<key) {
				 hi=mid-1;
			 }
			 else if(list.get(mid)>key) {}
			 	lo=mid+1;
		 }
		 return -1;
	 }
}
