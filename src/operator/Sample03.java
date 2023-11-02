package operator;

public class Sample03 {
	public static void main(String[] args) {
		
		/*
		 *  증감연산자
		 * 		++ --
		 * 	증감연산자는 변수의 값을 1 증가시키거나 1 감소시킨다
		 * 	증감연산자는 단항 연산자다
		 * 	증감연산자의 사용에
		 * 		int a = 10;
		 * 		a++;    // 후위형
		 * 
		 *   	int b = 10;
		 *   	++b; 	// 전위형
		 *   
		 *  증감연산자는 반복잡업내에서 주로 사용한다
		 */
		
		// 증감연산자를 단독으로 사용하는 경우
		int num1 = 10;
		int num2 = 10;
		
		num1++;
		++num1;
		System.out.println(num1); 		// 12
		
		num2--;
		--num2;
		System.out.println(num2); 		// 8
		
		// 증감연산자를 다른 연산자와 함께 사용하는 경우
		// 전위형 - 변수의 값을 증가시키고 연산에 사용
		// 후위형 - 연산을 처리 한 후 값을 증가시킨다(출력에는 값이 증가하지 않은 값이 나타난다)
		int num3 = 10;
		int num4 = 10;
		
		System.out.println(++num3); 	// 11
										// 1 num3의 값 +1
										// 2 덧셈연산
										// 3 11출력
		
		System.out.println(num4++); 	// 10  --> 결과적으로 값은 11로 동일하다
										// 1 덧셈연산
										// 2 num3의 값 +1
	}
}
