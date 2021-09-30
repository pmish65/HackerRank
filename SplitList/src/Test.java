import java.util.Scanner;

public abstract class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner scan = new Scanner(System.in);
		ListNode curr=null;
		ListNode head=null;
		for(int i=0;i<10;i++) {
			
			ListNode list = new ListNode();
			list.val=scan.nextInt();
			if(i==0) {
				curr=list;
				head=list;
			}
			else {
				curr.next=list;
				curr=list;
			}
		}
		ListNode[] list = s.splitListToParts(head, 3);
		for(ListNode l : list) {
			ListNode currr=l;
			while(currr!=null) {
				System.out.print(currr.val);
				currr=currr.next;
				
			}
			System.out.println();
		}
		scan.close();

	}

}
