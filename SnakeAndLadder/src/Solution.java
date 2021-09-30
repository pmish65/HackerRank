import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int snakeAndLadder(int[][] board) {
		int n = board[0].length;
		int steps=0;
		boolean[][] visited = new boolean[n][n];
		visited[n-1][0]=true;
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		while(!q.isEmpty()) {
			int x=q.poll();
			for(int k=1;k<=6;k++) {
				if(k+x>n*n) {
					return steps;
				}
				int[] pos=findCoordinates(k+x, n);
				int r=pos[0];
				int c=pos[1];
				if(visited[r][c]) {
					continue;
				}
				visited[r][c]=true;
				if(board[r][c]==-1) {
					q.add(k+x);
				}
				else {
					q.add(board[r][c]);
				}
				
			}
			steps++;
		}
		return steps;
	}
	public int[] findCoordinates(int x,int y) {
		int row=y-(x-1)/y-1;
		int coulum=(x-1)%y;
		if(row%2==y%2) {
			return new int[]{row,y-1-coulum};
		}
		else {
			return new int[] {row,coulum};
		}
	}
}
