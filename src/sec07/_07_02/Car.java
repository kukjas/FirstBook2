package sec07._07_02;

public class Car {
	Tire FL = new Tire("�տ���", 6);
	Tire FR = new Tire("�տ�����", 2);
	Tire RL = new Tire("�ڿ���", 3);
	Tire RR = new Tire("�ڿ�����", 4);
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
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
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
