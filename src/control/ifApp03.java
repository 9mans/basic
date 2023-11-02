package control;

public class ifApp03 {
	
	public static void main(String[] args) {
		
		// 주차 정산 시스템 
		// 주차비는 3000원
		// 1시간 초과후에는 10분당 1000원   		// 요구사항을 보고 명사를 찾아라 명사 = 값 변수선언
		// 차량배기량이 900cc 미만은 50% 할인된다 	//결과도 명사
		
		// 기본요금
		int defaultpay = 3000;
		// 10분당 초과요금
		int payper10Minutes = 1000;
		// 배기량
		int engineDisplacement = 600;
		// 총주차시간(분단위)
		int minutes = 294;
		// 주차비
		int pay = 0;
		
		if (minutes < 60) {
			// 1시간 미만일때는 기본요금
			pay = defaultpay;
		} else { 
			// 1시간을 초과한 경우에는 10분 단위로 초과요금 적용
			minutes -= 60;
			// 초과 시간을 계산
			int times = minutes/10;
			
			pay = defaultpay + payper10Minutes*times;
		}
		
		System.out.println("총 주차요금: " + pay);
		
		// 배기량이 900cc 미만인 경우 할인 적용
		if(engineDisplacement < 900) {
			pay = pay/2;
		}
		
		System.out.println("총 결제금액: " + pay);
		
	}
}
