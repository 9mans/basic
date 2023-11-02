package variable;

public class Sample04 {
	public static void main(String[] args) {
		
		/*
		 *  문자 자료형
		 *  	char
		 *  
		 *  문자 자료형 타입의 변수는 오직 한 문자만 저장할 수 있다
		 *  문자 자료형의 유니코드를 지원하기 때문에 전세계 모든 글자 표현가능
		 *  
		 *  만약 1 글자 이상을 저장하는 경우에는 String 객체를 사용한다
		 *  대부분의 경우 문자하나로 이루어진 값이라 하더라도 String 타입을 사용한다
		 */
		
		char ch1 = 'A';
		char ch2 = '가';
		char ch3 = '\uAC00';  	// '가' <- 문자(char) "가나다" <- 문자열(String)
							  	// '역슬래쉬u16진수' = 유니코드 코드값을 사용하겠다 선언  (I18N = 국제화)
		char ch4 = '\uAC01';
		char ch5 = 65; 			// 10진수 65 = 유니코드 0041과 같다
		char ch6 = 44032; 		//10진수 44032는 유니코드AC00이다
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		
		
	}
}

