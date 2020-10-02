package sec07._05_02;

public class Car {

	//필드
	public int speed;

	//일반메소드
	public void speedUp() {
		speed+=1;
	}

	//final 메소드
	public final void stop() {
		speed = 0;
	}
}
