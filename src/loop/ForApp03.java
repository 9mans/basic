package loop;

public class ForApp03 {
	
	public static void main(String[] args) {
	
		// 구구단 출력하기
		/*
		 *  3단 출력하기
		 *  3 * 1 = 3
		 *  3 * 2 = 6
		 *  3 * 3 = 9
		 *  3 * 4 = 12
		 *  3 * 5 = 15
		 *  3 * 6 = 18
		 *  ...
		 *  3 * 9 = 27
		 */
		int dan = 3;
		
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + " * " + num + " = " + dan*num);
		}
	}
}
