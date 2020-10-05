package sec07._07_02;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problem = car.run();	//0~4까지 값이 있음
			
			switch(problem) {	// probremLocation 변수의 값에 따라 해당 타이어를 새 Hankook타이어와 Kumho 객체로 교체함
				//주목할 코드는15,18,19, 22, 26 라인인데, Car객체의 Tire필드에 Hankook객체와 Kumho 객체를 대입하고 있음
				//Tire필드에 Hankook객체와 Kumho 객체를 대입하고 있음. 즉 자동타입 변환이 되고 있음
				case 1: //교체된 이후부터는 Car 객체의 run() 메소드가 호출될 때 Hankook타이어와 Kumho 객체에서
							//재정의(오버라이딩 된 roll 메소드가 실행됨)
					System.out.println("앞왼쪽 한국타이어로 교체"); //만약 앞 왼쪽 타이어가 펑크나면
					car.FL = new HankookTire("FL",15);
					break;
				case 2:
					System.out.println("앞오른쪽 금호타이어로 교체");
					car.FL = new KumhoTire("FR",13);
					break;
				case 3:
					System.out.println("뒤왼쪽 한국타이어로 교체");
					car.FL = new HankookTire("FL",14);
					break;
				case 4:
					System.out.println("뒤오른쪽 금호타이어로 교체");
					car.FL = new KumhoTire("FR",17);
					break;
			}
			System.out.println("---------------------------------------");
		}
	}
}
