package operator;

public class Sample01 {
	
	public static void main(String[] args) {
		/*
		 *  산술연산자
		 *		+ - * / %  
		 *		
		 *		%는 나머지 연산자 나누기 연산에서 나머지를 반환하는 연산자
		 *			나머지 연산의 결과는 항상 0 ~ (나누는 수 -1)
		 *		산술연산자는 정수나 실수에 대한 산술 연산을 수행한다
		 *		산술연산자는 연산에 참여한 값의 타입과 동일한 타입의 연산결과를 제공한다
		 *		산술연산자 중에서 덧셈 연산자는 2가지 용도로 활용된다
		 *			1. 숫자 + 숫자 ---> 덧셈연산
		 *			
		 * 			2. 숫자 + 문자열
		 *			   문자열 + 숫자   ---> 이어붙이기, 결과는 문자열이다
		 *			   문자열 + 문자열
		 */
		
		System.out.println(System.currentTimeMillis()); // <- 유닉스타임
		// 중요하게 사용된다 (유닉스시간)
		
		int num1 = 30;
		int num2 = 4;
		
		// 일반적으로 덧셈뺄셈은 한칸 띄워서 곱셈나눗셈은 붙혀서
		System.out.println(num1 + num2);    // 34
		System.out.println(num1 - num2);	// 26
		System.out.println(num1*num2);		// 120
		System.out.println(num1/num2);		// 7 (값은 7.5지만 정수라 7이출력됨) 
		System.out.println(num1%num2);		// 2
		
		//공백을 한 줄 넣는다는 의미는 다른 이야기를 한다는 이야기다 
		// 예를 들어 위를 보면 변수선언과 값을 출력하는 코드 사이에 공백이있다
		
		int num3 = 3;
		char ch1 = 'A';
		
		// 정수 + 문자 -> 정수 + 정수 로 변환 후 산술연산이 실행된다
		System.out.println(num3 + ch1); // A의 유니코드 값이 65이기 때문에 65로 변환되어 68
		System.out.println((char)(num3 + ch1)); //68의 값이 char 타입으로 변환되어 D
		
		// 숫자와 문자열의 덧셈 연산
		System.out.println("abc" + 1); 		// "abc1"
		System.out.println(1 + "abc"); 		// "1abc"
		System.out.println("abc" + "def"); 	//"abcdef"
		System.out.println(1 + 2 + 3 + "abc" + 4 + 5); //6abc45 문자열을 만나기전까진 숫자연산 
		
	}
}
