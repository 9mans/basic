package array;

public class Array08 {
	
	public static void main(String[] args) {
		/*
		 *  다차원 배열
		 *  
		 *  2차원 배열의 형식
		 *   
		 *	 - 배열 리터럴을 이용한 2차원 배열객체 생성하기
		 *		자료형[][] 참조변수 = {{값, 값, 값}, {값, 값, 값}};   
		 *   - new 키워드를 이용한 2차원 빈 배열객체 생성하기
		 *  	자료형[][] 참조변수 = new 자료형[rows][cols];
		 */
		
		int[][] arr1 = {{11, 22, 33}, {44, 55, 66}}; //2차원 배열의 처리는 중첩된 for문을 사용한다
		/*
		 *      0   1   2
		 *   0 [11][22][33]
		 *   1 [44][55][66]
		 */
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println(i +", " + j + "번째 ->" + arr1[i][j]);
			}
			
		}
		
		for (int[] arr : arr1) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
	}
}
