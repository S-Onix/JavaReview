package interfacePhone;

public class MainClass {
	public static void main(String[] args) {
		IFuntion a = new APhone();
		IFuntion b = new BPhone();
		IFuntion c = new CPhone();
		
		//다형성 덕분에 같은 타입으로 통일 되어 배열에 배치 가능
		IFuntion [] iFuntions = {a,b,c};
		
		for(int i = 0; i < iFuntions.length; i++) {
			iFuntions[i].cellSendReceive();
			iFuntions[i].canLte();
			iFuntions[i].tvRemoteController();
			System.out.println("=================================");
			
		}
		
	}
}
