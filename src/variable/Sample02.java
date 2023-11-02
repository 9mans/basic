package variable;

public class Sample02 {

	public static void main(String[] args) {
		
		/*
		 *  정수 자료형
		 *  byte, short, int, long
		 *  
		 *  정수 자료형의 기본(default) 자료형은 int
		 *  대부분의 프로그램에서 정수값은 int 범위내에 속하기 때문에
		 *   특별한 경우가 아니면 정수를 저장하는 변수는 int 타입으로 생성한다
		 *   (byte 타입은 입출력에서 바이너리 데이터를 다룰 때 사용한다)
		 *   (long 타입은 int범위를 초과하는 정수값을 다룰 때 사용한다
		 *    대표적인 값은 은행 예금의 잔액 등이다) 
		 */
		
		// 정수 자료형타입의 변수 생성과 초기화
		int num1 = 100;					// 양의 정수값을 저장한다
		int num2 = -100;				// 음의 정수값을 저장한다
		int num3 = 100_000_000;			// 자릿수가 표현된 정수값을 저장한다
		int num4 = 0100;				// 8진법으로 표현된 정수값을 저장한다 (0)
		int num5 = 0x100;				// 16진법으로 표현된 정수값을 저장한다 (0x)
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//	int 범위를 초과하는 정수값의 저장 및 출력
		//	정수값이 int의 범위를 초과하는 경우 long 타입의 변수에 저장한다
		// 	정수값이 int의 범위를 초과하는 경우 정수값 끝에 L 혹은 l 을 붙인다
		long num6 = 10_000_000_000L;
		
		System.out.println(num6);
		// 	계산의 결과가 int 범위를 초과하는 경우
		int num7 = 123456789;              //곱해서 나오는 값으 크기를 생각해서 변수선정하기
		int num8 = 123;
		
		;           // *부호비트 0일때 양수  / -값이나옴 
		long num9 = (long)num7 * num8;     // *부호비트 0일때 양수  / 정상적인 값이 나옴
		System.out.println(num9);         //         1일때 음수
		
		double x = 0.1;
		double y = 0.2;
		double z = (x*10 + y*10)/10;
		
		System.out.println(z);
	
		}
	}




