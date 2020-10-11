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
			System.out.println(location + "Ÿ�̾�� "  + (maxRotation - accumulatedRotation) + "ȸ ���డ��");
			if ((maxRotation - accumulatedRotation)==1) {
				System.out.println("(����Ұ� �����)");
			}
			return true;
		} else {
			System.out.println("����/ ����: "+ location + "Ÿ�̾� ��ũ ***");
			return false;
		}
	}

//	public String checkLocation(int location) {
//		// TODO Auto-generated method stub
//		if(location == 1) {
//			return "�տ���";
//		}else if(location == 2) {
//			return "�տ�����";
//		}else if(location == 3) {
//			return "�ڿ���";
//		}else if(location == 4){
//			return "�ڿ�����";
//		}else {
//			return "Ÿ�̾ �߸� ��ü�Ͽ����ϴ�";
//		} 
//	}
}
