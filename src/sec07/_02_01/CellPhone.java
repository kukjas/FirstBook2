package sec07._02_01;

public class CellPhone {
	//�ʵ�
	String model;
	String color;

	//������

	//�޼ҵ�	
	void powerOn() {System.out.println("power on");}
	void powerOff() {System.out.println("power off");}
	void bell() {System.out.println("bell rings");}
	void sendVoice(String message) {System.out.println("for you: " + message);}
	void receiveVoice(String message) {System.out.println("for me: " + message);}
	void hangUp() {System.out.println("hangUp");}
}
