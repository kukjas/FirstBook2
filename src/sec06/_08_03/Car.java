package sec06._08_03;

public class Car {

		int speed;
//		������
		Car() {};
//		�޼ҵ�
		int getSpeed() {
			return speed;
		}
		
		void keyTurnOn() {
			System.out.println("TurnOn");
		}
		
		void run() {
			for (int i = 10; i <= 50; i+=10) {
				speed =i;
				System.out.println("running with "+ speed + "k/m");
			}
		}
}
