package sec07._05_02;

public class Car {

	//�ʵ�
	public int speed;

	//�Ϲݸ޼ҵ�
	public void speedUp() {
		speed+=1;
	}

	//final �޼ҵ�
	public final void stop() {
		speed = 0;
	}
}
