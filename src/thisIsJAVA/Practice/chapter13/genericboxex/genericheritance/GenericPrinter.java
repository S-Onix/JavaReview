package thisIsJAVA.Practice.chapter13.genericboxex.genericheritance;

//Material Ŭ������ ��ӹ޴� �ڽĵ鿡 ���� ������ ��
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
