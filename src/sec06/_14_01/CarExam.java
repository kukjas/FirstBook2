package sec06._14_01;

public class CarExam {
	public static void main(String[] args) {
		
		Car myCar= new Car();

//		�߸��� �ӵ�
		myCar.setSpeed(-50);
		System.out.println("speed is " + myCar.getSpeed());

//		�޸�
		myCar.setSpeed(50);
		
//		����,(������ �ʾҴٸ� �����)
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		
		System.out.println("speed is " + myCar.getSpeed());
	}
}
