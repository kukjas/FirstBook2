package sec06._08_01;

public class Computer {
	
//	�迭
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
//	����Ʈ
	int sum2(int ...values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}
