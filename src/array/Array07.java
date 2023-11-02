package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array07 {

	public static void main(String[] args) {
		
		/*
		 * 임의의 숫자 10개가 저장되어 있는 배열을 생성하고,
		 * 복사시작위치 복사종료위치를 입력받아서 
		 * 원본배열에서 해당 범위의 값을 가져와서 새로운 배열을 생성하기
		 */
		
		// 정수 10개를 저장하는 배열객체를 생성하고 그 객체의 주소값을 numbers 변수에 대입
		int[] numbers = new int[10];
		
		for (int index = 0; index < numbers.length; index++) {
			// 1 ~ 100 사이의 임의의 정수를 number에 대입한다
			numbers[index] = (int) (Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(numbers)); //arrays를 임포트해야된다
		
		// 시작위치 종료위치를 입력받기
		
		// 표준입력장치의 입력내용을 읽어오는 Scanner객체를 생성해서 
		// 그 객체의 주소값을 참조변수 scanner에 대입한다
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시작위치 입력: " );
		int start = scanner.nextInt();
		System.out.println("종료위치 입력: " );
		int end = scanner.nextInt();
		
		// 원본 배열에서 시작위치부터 종료위치까지 값을 복사해서 새로운 배열에 저장하기
		int[] dest = new int [end - start +1];
		// 원본 배열에서 새 배열로 값 복사하기
		int position = 0; // 새 배열의 0번째부터 값이 저장하기 위한 변수
		for (int index = start; index <= end; index++) {
			dest[position] = numbers[index];
			position++;
			
			
		}
		// 새배열의 값 출력하기
		for (int value : dest) {
			System.out.println(value + " ");
		}
		System.out.println();
		
		
		scanner.close();
	}
}
