package sec07._07_02;

public class KumhoTire extends Tire{
																			
	public KumhoTire(String location, int maxRotation) {
		super (location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "��ȣŸ�̾� ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "��ȣŸ�̾� ��ũ ***");
			return false;
		}
	}
}
