package control;

public class ifApp07 {
	public static void main(String[] args) {
		
		/*
		 *  빠르게 종료하기
		 *   나쁜 조건을 찾아서 발견되면 더 이상 수행문을 수행하지 않고 
		 *   해당 위치에서 메소드의 실행을 중단시킨다
		 *   
		 *   return 키워드는 메소드의 실행을 즉시 중단시킨다
		 *   
		 *   break 는 해당 if 문만 종료시키지만, return 은 해당 메소드가 호출된 곳까지 종료시킨다. 
		 *   즉, if 문을 포함한 메소드 자체를 종료시킨다.
		 *   
		 *   
		 *   "빠르게 종료하기"를 활용하면 불필요한 검사가 실행되지 않는다
		 *   "빠르게 종료하기"를 활용하면 프로그램의 구조를 단순하게 작성할 수 있다
		 *   "빠르게 종료하기"를 활용하면 코드의 가독성을 향상시킨다
		 *   
		 *   형식
		 *     if (나쁜조건) {
		 *     		수행문;
		 *     		return;
		 *     }
		 *     수행문; // 나쁜조건이 아닐때만 실행된다
		 */
		
		
		int kor = 80;
		int eng = 70;
		int math = 100;
		
		if (kor < 40) {
			System.out.println("국어 과락" + kor);
			return; // 해당 메소드를 즉시 중단 "빠른종료"
		}
		if (eng < 40) {
			System.out.println("영어 과락" + eng);
			return;
		}
		if (math < 40) {
			System.out.println("수학 과락" + math);
			return; 
		}
		
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


	/*
	 * 빠른종료 사용했을때
	 *	로그인 하기
	 *	
	 *	사용자정보 = 아이디로사용자정보조회();
	 *	if (사용자가없다) {
	 *		 System.out.println("가입된 아이디가 아닙니다");
	 *		 return;
	 *	} 
	 *	if (사용자정보.회원상태 == "탈퇴") {
	 *			System.out.println("탈퇴된 사용자는 로그인 할 수 없습니다);
	 *			return;
	 *	}
	 *	if (사용자정보.비밀번호 != 비밀번호칸에 입력한 비밀번호) {
	 *			System.out.println("비밀번호가 일치하지 않습니다");
	 *			return;
	 *	}
	 *
	 *	사용자인증이 통과된 사용자다
	 *	새 메일 개수 조회, 새 쪽지 개수 조회
	 *	홈화면으로 이동
	 *
	 *  //빠르게 종료하기를 사용하지 않을때
	 *  
	 *  사용자정보 = 아이디로사용자정보조회();
	 *  
	 *  if (사용자정보 != null) {
	 *  		if (사용자정보.회원상태 != "탈퇴") {
	 *  			if(사용자정보.비밀번호 == 비밀번호칸에입력한비밀번호) {
	 *  					사용자인증이 통과된 사용자다
	 *  					새 메일, 새 쪽지 조회
	 *  			} else {
	 *  				System.out.println("비밀번호가 일치하지 않습니다")
	 *  			} else {
	 *   				System.out.println("탈퇴된 이용자는 로그인할 수 없습니다")
	 *  		}
	 *  				System.out.println("로그인 정보를 확인 할 수 없습니다")
	 *  }
	 */
