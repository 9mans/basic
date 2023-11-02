package operator;

public class Sample07 {
	public static void main(String[] args) {
		/*
		 *  비트 연산자
		 *  	& | ^ ~
		 *  
		 *  비트 연산자는 연산자의 좌항과 우항의 값이 숫자값이다
		 *  (암호화와 관련된 코딩에 주로 사용한다)
		 *  비트 연산자는 좌항과 우항의 값을 비트단위로 논리연산한다
		 * 	비트 연산자
		 * 		& : 피연산자 양 쪽의 값이 모두 1일때 1이다 그 외는 0
		 * 		| : 피연산자 중 한 쪽의 값이 1이면 1이다 그 외는 0
		 * 		^ : 피연산자의 값이 서로 다를 때 1이다 같으면 0  
		 * 		~(보수연산) : 피연산자의 값이 0이면 1, 1이면 0 
		 *  
		 *  쉬프트 연산자
		 *  	<<  >>  >>>
		 *  << 
		 * 		x << y
		 * 			정수 x의 각 비트를 y만큼 왼쪽으로 이동시킨다 (빈 자리는 0으로 채운다)
		 *	>>
		 *		x >> y
		 *			정수 x의 각 비트를 y만큼 오른쪽으로 이동시킨다 (빈 자리는 최상위 부호비트와 같은 값으로 채운다)
		 *	>>> 
		 *		x >>> y
		 *			정수 x의 각 비트를 y만큼 오른쪽으로 이동시킨다 (빈 자리는 0으로 채운다) 
		 *  
         *	
		 *  ip주소 2개를 각각 서브넷마스크와 &연산했을때 값이 같으면 같은 네트워크다
		 *  
		 *  다른 네트워크에 있는 ip에 데이터를 전달할때는 게이트웨이를 통한다
		 *  
		 *  서브넷마스크
		 *  255.0.0.0 		a클래스 ip주소 255 x 255 x 255 의 컴퓨터를 연결한수있는 네트워크
		 *  255.255.0.0 	b클래스 255 x 255
		 *  255.255.255.0 	c클래스 255		
		 *   */
		
		int num1 = 17;
		int num2 = 28;
		
		System.out.println("num1의 값: "+ num1);
		System.out.println("num2의 값: "+ num2);
		
		System.out.println("num1에 대한 이진수 값: "+ Integer.toBinaryString(num1));
		System.out.println("num2에 대한 이진수 값: "+ Integer.toBinaryString(num2));
		
		int num3 = num1&num2;
		int num4 = num1|num2;
		int num5 = num1^num2;
		int num6 = ~num1; 
		
		System.out.println("num3의 값 " + num3);
		System.out.println("num3에 대한 이진수 값: " + Integer.toBinaryString(num3));
	
		System.out.println("num4의 값 " + num4);
		System.out.println("num4에 대한 이진수 값: " + Integer.toBinaryString(num4));
	
		System.out.println("num5의 값 " + num5);
		System.out.println("num5에 대한 이진수 값: " + Integer.toBinaryString(num5));

		System.out.println("num6의 값 " + num6);
		System.out.println("num6에 대한 이진수 값: " + Integer.toBinaryString(num6));
	
	}
}
