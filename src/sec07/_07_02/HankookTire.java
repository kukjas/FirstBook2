package sec07._07_02;

public class HankookTire extends Tire {
	
	public HankookTire (String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "�ѱ�Ÿ�̾�� "  + (maxRotation - accumulatedRotation) + "ȸ ������");
			return true;
		} else {
			System.out.println("����/ ����: "+ location + "�ѱ�Ÿ�̾� ��ũ ***");
			return false;
		}
	}

	public String checkLocation(int location) {
		// TODO Auto-generated method stub
		if(location == 1) {
			return "�տ���";
		}else if(location == 2) {
			return "�տ�����";
		}else if(location == 3) {
			return "�ڿ���";
		}else if(location == 4){
			return "�ڿ�����";
		}else {
			return "�ѱ�Ÿ�̾ �߸� ��ü�Ͽ����ϴ�";
		} 
			
	}
}
