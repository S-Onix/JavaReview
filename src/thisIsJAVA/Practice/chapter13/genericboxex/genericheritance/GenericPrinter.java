package thisIsJAVA.Practice.chapter13.genericboxex.genericheritance;

//Material 클래스를 상속받는 자식들에 대해 제한을 둠
public class GenericPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}

}
