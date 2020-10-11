package sec07._07_02;

public class CarArrangeExam {
	public static void main(String[] args) {
		CarArrange carArrange = new CarArrange();
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = carArrange.run();
			
			if(problemLocation != 0) {
				System.out.println(carArrange.tires[problemLocation - 1].location + " 한국타이어교체");
				carArrange.tires[problemLocation -1] 
						=  new HankookTire(carArrange
								.tires [problemLocation - 1].location, 15); 
			}
			
			System.out.println("-------------------------------------------------");
		}
	}
}
