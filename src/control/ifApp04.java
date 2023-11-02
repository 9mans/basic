package control;

public class ifApp04 {
	public static void main(String[] args) {
		
		/*
		 *  if ~ else if ~ else if ~ else 구문
		 *  
		 *  형식
		 *  
		 *  	if (조건식1) {
		 *  		// 조건식1 이 true 로 판정되면 실행되는 수행문
		 *  		수행문;
		 *  } else if (조건식2) {
		 *  		// 조건식2 이 true 로 판정되면 실행되는 수행문
		 *  		수행문;
		 *  		수행문;
		 *  } else if (조건식3) {
		 *  		// 조건식3 이 true 로 판정되면 실행되는 수행문
		 *  		수행문;
		 *  		수행문;
		 *  } else {
		 *  		// 조건식 1,2,3 이 모두 false 일 때 실행되는 수행문
		 *			수행문;
		 *			수행문;  
		 *  }
		 *  
		 *  검사할 조건이 여러 개일 때 사용하는 제어문
		 *  조건식을 작성할 때는 조건을 잘 파악해서 순서에 맞게 작성한다
		 *  (조건이 일치여부를 판정하는 조건일 때는 조건식의 순서가 별로 중요하지 않다
		 *   조건이 값의 대소관계를 비교하는 조건일 때는 조건식의 순서가 중요하다)
		 *   
		 *   한 종류의 값에 대해서 서로 다른 조건이 여러 개 존재하는 경우 사용한다
		 */
		
		// 구매금액에 따른 적립포인트 계산 
		// 구매금액이 100만원 이상일 때  5%
		// 		   50만원 이상일 때  2%
		//         30만원 이상일 때  1%
		//         10만원 이상일 때  0.3%
		//		   그 외는 0.1%로 한다
		
		int orderPrice = 10_000; 
		int point = 0;
		double depositRate = 0.01; // 초기에 변수를 선언할때 그 외의 값을 설정해놓으면
								   // 마지막에 else를 굳이 사용하지 않아도 된다
		if (orderPrice >= 1_000_000) {
			
			depositRate = 0.05;
			//point = (int)(orderPrice*0.05); else구간에 게속 똑같은 코드가 들어가기때문에 
			// 이런식으로도 코딩 할 수 있다
		} else if (orderPrice >= 500_000) {
			
			depositRate = 0.03;
			
		} else if (orderPrice >= 300_000) {
			
			depositRate = 0.01;
			
		} else if (orderPrice >= 100_000) {
			
			depositRate = 0.003;
			
		}
		point = (int) (orderPrice*depositRate);
		
		System.out.println("구매금액: " + orderPrice);
		System.out.println("적립 포인트: " + point);

	}
}
