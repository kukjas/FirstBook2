package sec07._02_01;

public class DmbCellPhoneExam {
	public static void main(String[] args) {
		//��ü����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "black", 10);

		//CellPhone�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);

		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);

		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello~");
		dmbCellPhone.receiveVoice("hello~~ ");
		dmbCellPhone.hangUp();

		//DmbCellPhone�� �޼ҵ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
