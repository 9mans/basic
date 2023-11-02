package array;

	public class Array03 {
	
		public static void main(String[] args) {
			/*
			 *  배열 객체의 활용
			 *  	- 배열객체의 생성 목적은 같은 종류와 같은 타입의 값들을
			 *  	  하나의 이름으로 관리할 수 있다
			 *  	- 인덱스를 활용해서 배열의 각 저장소를 쉽게 엑세스할 수 있다
			 *  	
			 *  	예) 
			 *  		회원이름
			 *  			String name1 = "김";
			 *  			String name2 = "유신";
			 *  			String name3 = "신";
			 *  			String name4 = "김유신";
			 *  
			 *  			String[] names = {"김", "유신", "신", "김유신"};
			 *  
			 *  		회원이름 출력하기
			 *  			System.out.println(name1);
			 *  			System.out.println(name2);
			 *  			System.out.println(name3);
			 *  			System.out.println(name4);
			 *	                         |
			 *                         |
			 *                         V
			 *  			for (int index = 1; index < 4; index++) {
			 *  				System.out.println(names[index]);
			 *  
			 *  			}
			 *  
			 *  
			 */
		
			/*
			 *  국어점수, 영어점수, 수학점수가 저장된 배열이 각각 있다
			 *  국어점수의 평균, 영어점수의 평균, 수학점수의 평균을 계산해서 출력하기
			 */
			
			int[] korScores = {100, 20, 40, 50, 70, 80};
			int[] engScores = {20, 50, 20, 100, 70, 80};
			int[] mathScores = {50, 80, 30, 10, 70, 80};
			
			// 합계 계산하기
			int korTotal = 0;
			int engTotal = 0;
			int mathTotal = 0;
			
//			for (int index = 0; index < korScores.length; index++) {
//				korTotal += korScores[index];
//			}
//			for (int index = 0; index < engScores.length; index++) {
//				engTotal += engScores[index];
//			}
//			for (int index = 0; index < mathScores.length; index++) {
//				mathTotal += mathScores[index];
//			}
			
			// 향상된 for 문 알아두기
			for (int value : korScores) {
				korTotal += value;
			}
			for (int value : engScores) {
				engTotal += value;
			}
			for (int value : mathScores) {
			    mathTotal += value;
				
			}
			
			
			//평균 계산하기
			int korAVG = korTotal/korScores.length;
			int engAVG = engTotal/engScores.length;
			int mathAVG = mathTotal/mathScores.length;
			
			System.out.println("국어점수 평균: " + korAVG);
			System.out.println("영어점수 평균: " + engAVG);
			System.out.println("수학점수 평균: " + mathAVG);
			
			
		
		}
	
	}
