
public class mathEx {
	

	public static void main(String[] args) {
		int firstIncome = 2100;
		int increaseIncome = 60;
		int sum = 0;
		
		for(int i = 0; i < 11; i++) {
			int nextIncome = firstIncome + (increaseIncome*i);
			sum += nextIncome;
			if(i == 8) {
				System.out.println("9년차 연봉 : " + nextIncome);
			}
		}
		System.out.println("11년간 벌어들인 총액 : " + sum);
	}
}
