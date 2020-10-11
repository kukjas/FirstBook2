package sec07._07_02;

public class Car {
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire rearLeftTire = new Tire("뒤왼쪽", 3);
	Tire rearRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		
		System.out.println();
		if (frontLeftTire.roll() == false) {
			stop(); return 1;
		}
		if (frontRightTire.roll() == false) {
			stop(); return 2;
		}
		if (rearLeftTire.roll() == false) {
			stop(); return 3;
		}
		if (rearRightTire.roll() == false) {
			stop(); return 4;
		}
		return 0;
	}
	
	 void stop() {
	}
}
