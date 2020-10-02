package sec07._02_01;

public class DmbCellPhoneExam {
	public static void main(String[] args) {
		//객체생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "black", 10);

		//CellPhone폰으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		//DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);

		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello~");
		dmbCellPhone.receiveVoice("hello~~ ");
		dmbCellPhone.hangUp();

		//DmbCellPhone의 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
