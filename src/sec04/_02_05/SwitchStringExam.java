package sec04._02_05;

public class SwitchStringExam {
	public static void main(String[] args) {
		String position = "����";
		int money = 0;
		
		switch (position) {
		case "����":
			money = 800;
			System.out.println(money);
			break;
		case "����":
			money = 500;
			System.out.println(money);
			break;
		default:
			System.out.println(300);
		}
	}
}
