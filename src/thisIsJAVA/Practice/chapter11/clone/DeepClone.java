package thisIsJAVA.Practice.chapter11.clone;

import java.util.Arrays;

public class DeepClone implements Cloneable{
    public int [] array;
    public String name;
    public int number;
    public Thinclone tc;

    public DeepClone(String name, int number, int [] array, Thinclone tc){
        this.name = name;
        this.number = number;
        this.array = array;
        this.tc = tc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone clone = (DeepClone) super.clone();
        clone.array = Arrays.copyOf(this.array, this.array.length);
        clone.tc = new Thinclone(this.tc.id, this.tc.number);
        return clone;
    }

    public DeepClone getClone(){
        DeepClone cloned = null;
        try{
            cloned = (DeepClone) clone();

        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cloned;
    }
}
