package sec07._02_01;

public class DmbCellPhone extends CellPhone{

	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone (String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	};
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("channel " + channel  + " starts Dmb broadcasting receive");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("Change channel to no." + channel);
	}
	
	void turnOffDmb() {
		System.out.println("Stop receiving Dmb broadcasting");
	}
}
