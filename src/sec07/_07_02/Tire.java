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
			System.out.println(location + "타이어 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "타이어 펑크 ***");
			return false;
		}
	}	
}
