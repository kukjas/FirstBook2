package sec07._05_02;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}

//	 final �Լ�, �������̵� �Ұ�
//	@Override
//	public void stop() {
//		System.out.println("������ī�� ����");
//		speed = 0;
//	}
}	
