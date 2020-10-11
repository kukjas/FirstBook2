package sec07._07_02;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 8; i++) {
			System.out.println(i + "��° �������");
			int problemLocation = car.run();	//0~4���� ���� ����
			System.out.println();
			System.out.println(i + "��° ���� ����� ���� ����");
			
			switch(problemLocation) {	
				case 1:
					System.out.println("������ ��ũ�� �տ��� �ѱ�Ÿ�̾�� ��ü"); 
					car.frontLeftTire = new HankookTire("�տ���",15);
					break;
				case 2:
					System.out.println("������ ��ũ�� �տ����� ��ȣŸ�̾�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����",13);
					break;
				case 3:
					System.out.println("������ ��ũ�� �ڿ��� �ѱ�Ÿ�̾�� ��ü");
					car.rearLeftTire = new HankookTire("�ڿ���",14);
					break;
				case 4:
					System.out.println("������ ��ũ�� �ڿ����� ��ȣŸ�̾�� ��ü");
					car.rearRightTire = new KumhoTire("�ڿ�����",17);
					break;
			}
			System.out.println("---------------------------------------");
		}
	}
}
