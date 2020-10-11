package sec07._07_02;

public class HankookTire extends Tire {
	
	public HankookTire (String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "한국타이어는 "  + (maxRotation - accumulatedRotation) + "회 가능함");
			return true;
		} else {
			System.out.println("멈춤/ 이유: "+ location + "한국타이어 펑크 ***");
			return false;
		}
	}

	public String checkLocation(int location) {
		// TODO Auto-generated method stub
		if(location == 1) {
			return "앞왼쪽";
		}else if(location == 2) {
			return "앞오른쪽";
		}else if(location == 3) {
			return "뒤왼쪽";
		}else if(location == 4){
			return "뒤오른쪽";
		}else {
			return "한국타이어를 잘못 교체하였습니다";
		} 
			
	}
}
