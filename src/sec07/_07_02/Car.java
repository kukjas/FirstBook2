package sec07._07_02;

public class Car {
	Tire FL = new Tire("앞왼쪽", 6);
	Tire FR = new Tire("앞오른쪽", 2);
	Tire RL = new Tire("뒤왼쪽", 3);
	Tire RR = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if (FL.roll() == false) {
			stop(); 
			return 1;
		}
		if (FR.roll() == false) {
			stop(); 
			return 2;			
		}
		if (RL.roll() == false) {
			stop(); 
			return 3;
		}
		if (RR.roll() == false) { 
			stop(); 
			return 4;			
		}
		return 0; 
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
