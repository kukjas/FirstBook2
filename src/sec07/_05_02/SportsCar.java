package sec07._05_02;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}

//	 final 함수, 오버라이딩 불가
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}	
