package day1; //빌드패스에서 클래스패스에 외부에서 다운받은 라이브러리를 추가할 수 있음

public class Sample03 { //String과 System은 JRE System Library에 저장되어 있는 클래스를 불러쓰는것이다.
	
	public static void main(String[] args) { 
		
		/*
		 *  System 클래스(설계도)는 자바프로그램이 실행되는 컴퓨터를 표현한다
		 *  	System.out은 표준 출력장치(모니터)를 나타낸다
		 *  	println(값)은 지정된 값을 출력하는 기능을 제공한다
		 *  
		 *   	println(값) - 지정된 값을 출력하고, 행을 바꾼다
		 *   	print(값) - 지정된 값을 출력만 한다            
		 */
		System.out.println("시스템의 표준출력장치로 출력한다"); 
		System.out.println("시스템의 표준출력장치로 출력한다"); //Ctrl + d 줄 삭제
		System.out.print("시스템의 표준출력장치로 출력한다");
		System.out.println("시스템의 표준출력장치로 출력한다");
		
	}
}
/*
 *String과 System 클래스
 *	JRE System Library에서 제공하는 클래스다
 *	JRE System Library의 java.base 모듈의 java.lang 패키지에 포함되어 있다.
 *	java.base 모듈에는 자바 프로그램 개발에 반드시 필요한 라이브러리(클래스의모음)를 포함하고 있다
 *	java.lang 패키지에는 자바언어의 가장 기본적인 라이브러리(클래스의모음)가 포함되어 있다 
 *		
 *	java.base 모듈에는 
 *		java.io - 입출력과 관련된 기능을 제공한다 
 *		java.lang - 자바의 가장 기본적인 클래스를 제공한다 
 *		java.util - 유용한 유틸리티 클래스를 제공한다 
 *		java.net - 네트워크 관련 기능을 제공한다
 *	등의 패키지를 포함하고있다
 */
