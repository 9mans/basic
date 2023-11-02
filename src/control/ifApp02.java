package control;

public class ifApp02 {
	public static void main(String[] args) {
		
		/*
		 *  if ~ else 문
		 *  
		 *  형식
		 *  
		 *  	if (조건식) {
		 *  		// 조건식이 ture로 판정되면 실행되는 수행문
		 *  		수행문;
		 *  		수행문;
		 *  } else {
		 *  	// 조건식이 false로 판정되면 실행되는 수행문
		 *  	수행문;
		 *  	수행문;   
		 *  }
		 *  
		 *  제시된 조건을 만족하는 경우에 실행할 작업이 있고
		 *  		  만족하지 못하는 경우에 실행할 작업이 있는 경우 사용
		 */
		
		// 주차비 정산 시스템
		// 주차비는 시간당 3000원이다 
		// 배기량이 900cc 미만인 차량은 50% 할인이 적용된다
		
		int engineDisplacement = 550; 	//배기량
		int hours = 3; 					// 시간
		int payPerhour = 3000; 			// 시간 당 요금
		
		int payAmount = 0;
		
		if (engineDisplacement < 900) {
			payAmount = payPerhour*hours/2;
		} else { payAmount = payPerhour*hours;
			
		}
		
		System.out.println("주차요금: " + payAmount);
		
	}
}
