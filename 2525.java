package vaa;

import java.util.Scanner;

public class 2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int shi = in.nextInt(); // 시
		int bun = in.nextInt(); // 분
		int obun = in.nextInt(); // 오븐 분

		int shi1 = ((((shi * 60) + bun) + obun) / 60) % 24; 
		int bun2 = bun + obun;

		if (shi1 == 24) {
			shi1 = 0;
		}

		if (bun2 > 60) {
			while (bun2 > 60) {
				bun2 -= 60;
			}
		}
		
		if (bun2 == 60) {
			bun2 = 0;
		}

		System.out.println(shi1 + " " + bun2);

	}
}
