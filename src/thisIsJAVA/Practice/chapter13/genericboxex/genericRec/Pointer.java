package thisIsJAVA.Practice.chapter13.genericboxex.genericRec;

public class Pointer <T,V>{
	
	T x;
	V y;
	
	public Pointer(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public V getY() {
		return y;
	}

	public void setY(V y) {
		this.y = y;
	}
	
	

}
