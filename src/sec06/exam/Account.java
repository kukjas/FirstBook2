package sec06.exam;

public class Account {
	
//	»ý¼ºÀÚ
	private int money;
	private int input;
	
	public void setBalance(int input) {
		
		if (input == 10000 | input == 300000) {
			money = input;
		} else {
			money = money;
		}
	}
	
	public int getBalance() {
		
		return money;
	}
}
