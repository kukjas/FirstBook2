package sec04._02_04;

public class IfNestedExam {
	public static void main(String[] args) {
		int score = (int)(Math.random()*10) + 85;
		
		if (score>90) {
			System.out.println("91�� �̻� 2�� ����");
			if (score>95) {
				System.out.println("1��");
			} else {
				System.out.println("2��");
			}
			
		} else {
			
			System.out.println("90�� ���ϰ� 2�� ����");
			if (score>88) {
				System.out.println("3��");
			} else {
				System.out.println("4��");
			}
		}
		
		System.out.println("score = " + score);
	}
}
