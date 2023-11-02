package operator;

public class Sample06 {
	public static void main(String[] args) {
		/*
		 *  조건 연산자
		 *  	조건식 ?   값1  : 값2
		 *  	조건식 ? 연산식1 : 연산식2
		 *  	
		 *  	조건식의 값이: true 로 판정되면 조건연산자의 최종결과는 값1 혹은 연산식 1이다
		 *  			   false 로 판정되면 조건연산자의 최종결과는 값2 혹은 연산식 2이다
		 *  
		 *  값1과 값2의 타입은 같은 타입이다
		 *  연산식1과 연산식2의 결과값도 같은 타입이다
		 *  
		 */
		
		// 평균점수가 60점 이상이면 합격, 그 외는 불합격
		int kor = 80;
		int eng = 70;
		int math= 50;
		
		int average = (kor + eng + math)/3;
		
		String result = average >= 60 ? "합격" : "불합격";
		System.out.println("결과: " + result);
		
		// 구매금액이 30만원 이상인 경우에는 구매금액의 3% 적립 그 외는 1% 적립포인트
		int orderPrice = 500_000;
		int point = orderPrice >= 300_000 ? (int)(orderPrice*0.03) : (int)(orderPrice*0.01);
		
		System.out.println("적립 포인트: " + point);
	}
}
