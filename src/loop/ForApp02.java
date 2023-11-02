package loop;

public class ForApp02 {
	
	public static void main(String[] args) {
		
		// 1~100 까지 정수의 합을 계산하기
		int sum = 0;
		//초기식, 조건식, 증감식에서 선언된 변수는 for 문 블록내에서만 사용된다
		for (int num = 1; num <= 100; num++) { 
			sum += num;
		}
		System.out.println("1~100 정수의 합: " + sum);
		
		
		// 1~100까지 정수 중에서 짝수의 합을 계산하기
		int evensum = 0;
		for (int num = 2; num <= 100; num+=2) {
			evensum += num;
		}
		System.out.println("1~100 정수 중 짝수의 합: " + evensum); ;
		
		// 1~100Rkwl 정수중에서 홀수의 합 계산하기
		int oddSum = 0;
		for (int num = 1; num <= 100; num++) {
			if (num%2 == 1) {
				oddSum += num;
			}
		}
		System.out.println("1~100 홀수의 합: " + oddSum);
	
	}
	
	
	
}
