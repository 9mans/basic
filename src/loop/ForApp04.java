package loop;

public class ForApp04 {

	public static void main(String[] args) {
		/*
		 *  중첩된 for 문
		 *  
		 *  for (초기식; 조건식; 증감식) {
		 *  	수행문1;
		 *  
		 *  	for (초기식; 조건식; 증감식) {
		 *  		수행문2;
		 *  
		 *  	}
		 *  }
		 *  
		 *  수행문 1은 바깥쪽 for 문의 반복 횟수 만큼 실행된다
		 *  수행문 1에서는 안쪽 for 문의 초기식에서 생성한 변수를 접근할 수 없다
		 *  
		 *  수행문 2은 바깥쪽 for 문이 한 번 실행될 때마다 안쪽 for 문의 반복횟수만큼 실행된다
		 *  수행문 2에서는 바깥 for 문의 초기식에서 생성한 변수
		 *             안쪽 for 문의 초기식에서 생성한 변수에 접근할 수 있다
		 *             
		 */
		
		/*
		 *  별 찍기
		 * ---------------- 
		 *  *              1 1
		 *  **			   2 11
		 *  ***			   3 111     (중첩된 for 문 사용)
		 *  ****		   4 1111
		 *  *****		   5 11111
		 * ---------------- 
		 *  *****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 *------------------ 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 *------------------    
		 */

		// 정방향 별 찍기
		/*
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 */
		
		for (int line = 1; line <= 5; line++) {                     //행을 출력

			for (int count = 1; count <= 5; count++) { 				//별을 출력
				System.out.print("*");// println 에서 ln 은 줄바꿈이라는 뜻이다
			}
			System.out.println();
		}
		
		// 별 찍기
		/*				행 별갯수
		 *  *			1	1
		 *  **			2	2
		 *  ***			3	3
		 *  ****		4	4
		 *  *****		5	5
		 */
		
		for (int line = 1; line <= 5; line ++) {
			for (int count = 1; count <= line; count++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 별 찍기
		/*    			행	별갯수
		 *  *****		1	5
		 *  ****		2	4	
		 *  ***			3	3
		 *  **			4	2
		 *  *			5	1
		 */
		
		for (int line = 1; line <= 5; line++) {
			for (int count = 5; count >= line; count--) {
		//  for (int count = 1; count >= 6 - line; count++) 로도 나타낼 수 있음
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 찍기
		/*          	행	공백	별
		 *      *  		1	4	1
		 *     **		2	3	2
         *    ***		3	2	3 //옆에 표를 작성해서 규칙을 찾는 연습
		 *   ****		4	1	4
		 *  *****		5	0	5
		 */
		
		for (int line =1; line <= 5; line++) {
			// 공백찍기
			for (int spaceCount = 1; spaceCount <= 5 - line; spaceCount++) {
				System.out.print(" ");
			}
			// 별 찍기
			for (int starCount = 1; starCount <= line; starCount++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
