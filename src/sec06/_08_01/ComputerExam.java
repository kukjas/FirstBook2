package sec06._08_01;

public class ComputerExam {
	public static void main(String[] args) {

//		�迭
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 = " + result1);
		
//		�迭
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 = " + result2);
		
//		����Ʈ
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 = " + result3);
//		����Ʈ
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 = " + result4);
	}
}
