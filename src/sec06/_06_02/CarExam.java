package sec06._06_02;

public class CarExam {
	public static void main(String[] args) {
//		��ü ����
		Car myCar = new Car();
//		�ʵ� �б�
		System.out.println("����ȸ�� = " + myCar.company);
		System.out.println("�𵨸� = " + myCar.model);
		System.out.println("���� = " + myCar.color);
		System.out.println("�ְ�ӵ� = " + myCar.maxSpeed);
		System.out.println("����ӵ� = " + myCar.speed);
//		�ʵ尪 ����
		myCar.speed = 200;
		System.out.println("�����ȼӵ� = " + myCar.speed);
	}
}
