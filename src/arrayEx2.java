import java.util.Scanner;

public class arrayEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] name = {"영희", "철수","길동","영수","말자"};
		int [] score = new int[5];
		int total = 0;
		int maxIndex = 0, minIndex = 0;
		for(int i = 0 ; i < name.length; i ++) {
			System.out.print(name[i] + "의 키를 입력하세요 : ");
			score[i] = scan.nextInt();
			total += score[i];
		}
		
		System.out.println("평균 : " + total/name.length);
		
		int max = score[0], min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				maxIndex = i;
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			if(min > score[i]) {
				min = score[i];
				minIndex = i;
			}
		}
		
		System.out.println("가장큰학생 : " + name[maxIndex]);
		System.out.println("가장작은학생 : " + name[minIndex]);
		
		scan.close();
	}
}
