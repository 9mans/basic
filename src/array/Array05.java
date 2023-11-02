package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 임의의 정수값을 여러 개 입력 받아서 가장 큰 값을 찾기
		// 키보드를 이용해서 정수 10개를 입력받고 가장 큰 값을 출력한다
		
		Scanner scanner = new Scanner(System.in);
		
		//정수 10개를 저장할 배열객체를 생성한다
		int[] numbers = new int[5];
		// 반복문을 이용해서 숫자를 입력받고 배열에 순서대로 저장한다
		for (int index = 0; index < 5; index++) {
			System.out.print("숫자 입력: ");
			numbers[index] = scanner.nextInt();
	
			System.out.println(Arrays.toString(numbers));
			
		}
		
		
		// 배열에 저장된 값 중에서 최대값 찾기
		int max = Integer.MIN_VALUE;
		for (int value : numbers) {
			if (max < value) {
				max = value;
			}
		}
		System.out.println("최대값: " + max);
		
		
		
		
		scanner.close();
	}
}
