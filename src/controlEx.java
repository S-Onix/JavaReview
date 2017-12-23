import java.util.Scanner;

public class controlEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int korean = scan.nextInt();
		System.out.println("영어 : ");
		int english = scan.nextInt();
		System.out.println("수학 : ");
		int math = scan.nextInt();
		
		double average = (korean + english + math)/3;
		
		if(korean > average) {
			System.out.println("국어는 평균보다 높습니다");
		}else
			System.out.println("국어는 평균보다 낮습니다");
		if(english > average) {
			System.out.println("영어는 평균보다 높습니다");
		}else
			System.out.println("영어는 평균보다 낮습니다");
		if(math > average) {
			System.out.println("수학은 평균보다 높습니다");
		}else
			System.out.println("수학은 평균보다 낮습니다");
		
		scan.close();
	}
}
