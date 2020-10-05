package sec07._07_02;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problem = car.run();	//0~4���� ���� ����
			
			switch(problem) {	// probremLocation ������ ���� ���� �ش� Ÿ�̾ �� HankookŸ�̾�� Kumho ��ü�� ��ü��
				//�ָ��� �ڵ��15,18,19, 22, 26 �����ε�, Car��ü�� Tire�ʵ忡 Hankook��ü�� Kumho ��ü�� �����ϰ� ����
				//Tire�ʵ忡 Hankook��ü�� Kumho ��ü�� �����ϰ� ����. �� �ڵ�Ÿ�� ��ȯ�� �ǰ� ����
				case 1: //��ü�� ���ĺ��ʹ� Car ��ü�� run() �޼ҵ尡 ȣ��� �� HankookŸ�̾�� Kumho ��ü����
							//������(�������̵� �� roll �޼ҵ尡 �����)
					System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü"); //���� �� ���� Ÿ�̾ ��ũ����
					car.FL = new HankookTire("FL",15);
					break;
				case 2:
					System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
					car.FL = new KumhoTire("FR",13);
					break;
				case 3:
					System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
					car.FL = new HankookTire("FL",14);
					break;
				case 4:
					System.out.println("�ڿ����� ��ȣŸ�̾�� ��ü");
					car.FL = new KumhoTire("FR",17);
					break;
			}
			System.out.println("---------------------------------------");
		}
	}
}
