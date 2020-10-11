package sec07._07_02;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 8; i++) {
			System.out.println(i + "번째 주행시작");
			int problemLocation = car.run();	//0~4까지 값이 있음
			System.out.println();
			System.out.println(i + "번째 주행 결과는 위와 같음");
			
			switch(problemLocation) {	
				case 1:
					System.out.println("이전에 펑크난 앞왼쪽 한국타이어로 교체"); 
					car.frontLeftTire = new HankookTire("앞왼쪽",15);
					break;
				case 2:
					System.out.println("이전에 펑크난 앞오른쪽 금호타이어로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽",13);
					break;
				case 3:
					System.out.println("이전에 펑크난 뒤왼쪽 한국타이어로 교체");
					car.rearLeftTire = new HankookTire("뒤왼쪽",14);
					break;
				case 4:
					System.out.println("이전에 펑크난 뒤오른쪽 금호타이어로 교체");
					car.rearRightTire = new KumhoTire("뒤오른쪽",17);
					break;
			}
			System.out.println("---------------------------------------");
		}
	}
}
