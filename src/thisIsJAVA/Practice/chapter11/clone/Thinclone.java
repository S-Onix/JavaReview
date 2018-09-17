package thisIsJAVA.Practice.chapter11.clone;

public class Thinclone implements Cloneable{
    public String id;
    public int number;

    public Thinclone(String id, int number){
        this.id = id;
        this.number = number;
    }

    public Thinclone getClone(){
        Thinclone clone = null;
        try{
            clone = (Thinclone) clone();
    }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

}
