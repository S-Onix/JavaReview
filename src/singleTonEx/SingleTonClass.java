package singleTonEx;

public class SingleTonClass {
	private static SingleTonClass SINGLETON_CLASS_INSTANCE;
    public int i = 10;

    private SingleTonClass(){
    }

    public static SingleTonClass getSingleTonClass(){
            if(SINGLETON_CLASS_INSTANCE == null) 
            { 
            	SINGLETON_CLASS_INSTANCE = new SingleTonClass(); 
            }
            return SINGLETON_CLASS_INSTANCE;
    }

    public int getI() {return i;}

    public void setI(int i) { this.i = i; }


}
