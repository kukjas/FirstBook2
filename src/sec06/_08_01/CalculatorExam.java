package sec06._08_01;

public class CalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(1, 2);
		System.out.println(result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);
		System.out.println(result2);
		
		cal.powerOff();
		
	}
}
