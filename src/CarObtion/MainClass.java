package CarObtion;

public class MainClass {
	public static void main(String[] args) {
		StarCar lowCar = new StarCarLowGrade(CarSpec.COLOR_BLUE, CarSpec.TIRE_NORMAL, CarSpec.DISPLACEMENT_2000, CarSpec.HANDLE_NORMAL);
		StarCar highCar = new StarCarLowGrade(CarSpec.COLOR_RED, CarSpec.TIRE_WILD, CarSpec.DISPLACEMENT_2200, CarSpec.HANDLE_POWER);
		
		lowCar.getSpec();
		highCar.getSpec();
		
		
	}
}
