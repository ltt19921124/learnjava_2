package bi1224day11;

import java.util.Scanner;

public class printTest {

	public static void main(String[] args) {
		System.out.println("������n��ֵ��");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int n = 9;
		int[][] rect = new int[n + 1][n + 1];
		
		int x = 0,y = 1;
		int px = 1,py = 0;
		int pn = n;
		int sum = n;
		
		for (int i = 1;i <= n * n;i++) {
			x += px;
			y += py;
			rect[x][y] = i;
			if (i == sum) {
				if (px == 1 || px == -1) {
					pn = pn - 1;
					sum = sum + pn;
					py = px;
					px = 0;
				} else {
					sum = sum + pn;
					px = -py;
					py = 0;
				}
			}
		}
		
		for (int i = 1;i <= n;i++) {
			for (int j = 1;j <= n;j++) {
				System.out.print(rect[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
