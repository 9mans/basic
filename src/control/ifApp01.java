package control;

public class ifApp01 {
	public static void main(String[] args) {
		
		/*
		 *  if 문
		 * 		조건식이 true로 판정될 때 실행할 수행문을 정의한다 
		 *  형식
		 *  	if (조건식) {
		 *  		// 조건식이 true로 판정될 때 실행되는 수행문이다
		 *  		수행문;
		 *  		수행문;
		 *  		수행문;
		 *  }
		 *  	조건식은 boolean 값이거나 연산결과가 boolean 값이다
		 */
		
		// 모두의 마블
		// 게임규칙 주사위 숫자가 2개 모두 6이 나오면 무인도에서 탈출한다
		// 실행할 때 마다 1 ~ 6 범위내의 임의의 정수가 나오게 하기 
		System.out.println((int)(Math.random()*6) + 1);
		
		// 0 <= Math.random() > 1
		// 0*6 <= Math.random()*6 > 1*6
		// 0 <= Math.random()*6 > 6
		// 0 + 1 <= Math.random()*6 + 1 > 6 + 1
		// 1 <= Math.random()*6 + 1 > 7 의 실수
		// 1 <= (int)(Math.random())*6 + 1 > 7 정수로 변환
		
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1 == 6 && num2 == 6) {
			System.out.println("탈출");
		} else {
			System.out.println("탈출실패");
		}
		
		System.out.println("다음 차례입니다");
	}
}
