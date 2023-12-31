package control;

public class ifApp06 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 성적으로 합격여부, 장학금 지급여부를 판정하기
		// 국어, 영어, 수학 중 한 과목이라도 40점 미만인 경우 과락으로 불합격
		// 평균점수가 60점 이상이면 합격이다
		// 평균점수가 96점 이상이면 장학금 지급대상이다
		// 출력내용
		// 	합격 불합격 여부가 출력된다
		//	    불합격인경우 불합격 사유를 출력한다 (과락(과목명과 점수), 평균점수 미달 불합격)
		// 	장학금 지급 여부가 출력된다
		
		int kor = 50;
		int eng = 80;
		int math = 20;
		
		
		// 과락여부를 검사한다
		boolean subjectFail = false;
		if (kor < 40) {
			System.out.println("국어 과락" + kor);
			subjectFail = true;
		}
		if (eng < 40) {
			System.out.println("영어 과락" + eng);
			subjectFail = true;
		} if(math < 40) {
			System.out.println("수학 과락" + math);
			subjectFail = true;
		}
		
		// 합격여부를 판정하기 위한 작업은 과목과락이 아닌 경우에만 수행한다
		// subjectFail은 과목과락 여부를 저장하고 있는 변수다
		// subjectFail 변수의 값을 조사해서 과목 과락여부를 확인한다
		
		if(!subjectFail) {
			int avg = (kor + eng + math)/3;
			if (avg >= 60) {
				System.out.println("합격입니다");
				if (avg >= 96) {
					System.out.println("장학금지급대상");
				}
			} else {
				System.out.println("불합격입니다");
				
			}			
		}
		
	}
}
