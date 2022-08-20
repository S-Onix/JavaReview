package datastructure;

public class ArrayImpl {
	int [] intArr;
	int count;
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;
	
	
	public ArrayImpl() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public ArrayImpl(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			int [] tempArr = intArr.clone();
			intArr = new int[count+10]; 
			ARRAY_SIZE = intArr.length;
			System.arraycopy(tempArr, 0, intArr, 0, tempArr.length);
			intArr[count++] = num;
		}else {
			intArr[count++] = num;
		}
	}
	
	public void insertElement(int position, int num) {
		if(position > count || position < 0) {
			System.out.println("Index out of bound ERROR");
			return;
		}
		
		if(count >= ARRAY_SIZE) {
			int [] tempArr = intArr.clone();
			intArr = new int[count+10]; 
			ARRAY_SIZE = intArr.length;
			System.arraycopy(tempArr, 0, intArr, 0, tempArr.length);
		}
		
		for(int i = count-1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		
		if(position > count || position < 0) {
			System.out.println("Index out of bound ERROR");
			return ret;
		}
		
		if(isEmpty()) {
			System.out.println("현재 배열이 비어있습니다.");
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i < count-1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		
		return ret;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int getSize() {
		return count;
	}
	
	public static void main(String[] args) {
		ArrayImpl test = new ArrayImpl();
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(10);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(11);
		test.addElement(12);
		test.addElement(12);
		test.addElement(12);
		test.addElement(12);
		test.addElement(12);
		test.addElement(12);
		
	}
}
