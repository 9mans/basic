package control;

import java.util.Scanner;

public class Pratice02 {
	
	public static void main(String[] args) {
		/*
		 *  완료시간 출력하기
		 *  
		 *  입력으로 현재 시간의 시간정보와 분 정보를 입력받는다
		 *  소유시간을 분단위로 입력받는다
		 *  
		 *  종료시점의 시간, 분 정보를 계산해서 출력한다
		 *  
		 *  예) 
		 *  시작시점의 hour: 15
		 *  시작시점의 minute: 20
		 *  소요시간(분) : 50 //시작시점의 분과 소요시간의 합이 60이넘으면 시간이 올라간다
		 *  
		 *  종료시점은 16시 10분
		 *  
		 *  종료시점의 시간은 (시작시점 분 + 소요시간) >= 60 인 경우 증가된다
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작시점의 hour를 입력하세요: ");
		int startHours = scanner.nextInt();
		
		System.out.print("시작시점의 minutes를 입력하세요: ");
		int startMinutes = scanner.nextInt();
	
		System.out.print("소요시간을 입력하세요: ");
		int runningTime = scanner.nextInt();
		
		
		int endHours = 0;
		int endMinutes = 0;
		
		// 예상완료시간을 계산하기
		
		if (startMinutes + runningTime >= 60) {
			// 총 분값을 계산
			int totalMinutes = startMinutes + runningTime;
			// 총 분값을 60으로 나누어서 증가시킬 시간 값을 구한다
			int increaseHours = totalMinutes/60;
			
			// 완료시점의 시 
			endHours = startHours + increaseHours;
			// 완료시점의 분
			endMinutes = totalMinutes%60;
			// endMinutes = totalMinutes - (increaseHours*60); 로 표현할 수도 있다
			
			
		} else {
			endHours = startHours;
			endMinutes = startMinutes + runningTime;
		} 
		
		
		
		
		// 예상완료시간을 출력하기
		
		System.out.println("완료시간: " + endHours + "시" + endMinutes + "분");
		
		
		
		scanner.close();
	}
}
