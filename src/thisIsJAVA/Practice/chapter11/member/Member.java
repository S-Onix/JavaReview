package thisIsJAVA.Practice.chapter11.member;

public class Member extends Object{
    private String id;
    private String name;

    public Member(String id, String name){
        this.id=id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode(){
        return  id.hashCode();
    }

    @Override
    public String toString() {
        return  id + ": " + name;
    }
}
