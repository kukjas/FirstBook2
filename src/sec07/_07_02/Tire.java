package sec07._07_02;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location; 
	
	public Tire (String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation; 
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "타이어는 "  + (maxRotation - accumulatedRotation) + "회 주행가능");
			if ((maxRotation - accumulatedRotation)==1) {
				System.out.println("(주행불가 예상됨)");
			}
			return true;
		} else {
			System.out.println("멈춤/ 이유: "+ location + "타이어 펑크 ***");
			return false;
		}
	}

//	public String checkLocation(int location) {
//		// TODO Auto-generated method stub
//		if(location == 1) {
//			return "앞왼쪽";
//		}else if(location == 2) {
//			return "앞오른쪽";
//		}else if(location == 3) {
//			return "뒤왼쪽";
//		}else if(location == 4){
//			return "뒤오른쪽";
//		}else {
//			return "타이어를 잘못 교체하였습니다";
//		} 
//	}
}
