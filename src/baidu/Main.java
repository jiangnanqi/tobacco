package baidu;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int[][] a = new int[m][n];
			int x = scan.nextInt();
			int y = scan.nextInt();
      int x = scan.nextInt();			
			while(true) {
				int move = move(a,x,y);
				if(move == 1) {
					x -=1;
				}else if(move == 2) {
					x +=1;
				}else if(move == 3) {
					y-=1;
				}else {
					y+=1;
				}
			}

		}
	}

	public static int move(int[][] a, int x, int y) {
		int value = a[x][y];
		int index = 0;
		int[] temp = new int[4];
		temp[0] = a[x][y - 1];
		temp[1] = a[x][y + 1];
		temp[2] = a[x - 1][y];
		temp[3] = a[x + 1][y];
		for(int i = 0;i<temp.length-1;i++) {
			if(temp[i]>temp[i+1]){
				index=i;
			}else {
				index = i+1;
			}
		}
		return index+1;

	}
}
