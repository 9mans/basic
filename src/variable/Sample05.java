package variable;

public class Sample05 {
	public static void main(String[] args) {
		
		/*
		 *  문자열 타입
		 *   -문자열은 1글자 이상의 문자를 표현하는 자료형이다.
		 *   -문자열은 ""사이에 표시한다
		 *   -문자열은 1글자 이상으로 표현되기 때문에
		 *    	문자열을 대상으로 다양한 작업을 수행할 필요가 있다
		 *    		+길이를 조회하기 
		 *    		+특정문자열이 포함되어있는지 조사하기
		 *    		+특정 위치의 문자 알아내기
		 *    		+특정 문자열로 시작하거나 끝나는지 알아내기
		 *    		+대/소문자 변환하기
		 *    		+특정 시작위치부터 지정된 위치까지 잘라내기
		 *    		+특정 문자열을 다른 문자열로 변경하기 등
		 *   - 자바는 문자열을 표현하고, 문자열을 조작하는 다양한 기능을 
		 *     포함하고 있는 String 클래스(설계도)를 제공한다
		 *      
		 *   예) 
		 *   		String s1 = "홍길동";
		 *    		String s2 = "서울특별시 종로구 봉익동";
		 *    		String s3 = "홍길동, 김유신, 강감찬, 김시민";
		 *    		String s4 = "010 - 1234 - 5678";
		 *    		String s5 = "A";
		 *    		String s6 = 'A'; // 오류다 (char)
		 *    
		 *    		char c1 = 'A';
		 *    		char c2 = "A"; // 오류다 (String)
		 */
		
		// 문자열 타입의 값을 저장하기
		String s1 = "홍길동";
		String s2 = "서울특별시 종로구 봉익동";
		String s3 = "A";
//		String s4 = 'A'; char 타입의 값을 String 타입의 변수에 대입 x
		
		// 각각의 변수에 저장된 문자열을 출력
		System.out.println(s1);
		System.out.println(s2);  // 값 = 정수, 실수, 문자, 문자열 그외에는 모두 예약어와 식별자 
		System.out.println(s3);
		// 각각의 변수에 저장된 문자열의 길이를 출력
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
	}
}
