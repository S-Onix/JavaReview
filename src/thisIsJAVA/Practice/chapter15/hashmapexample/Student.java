package thisIsJAVA.Practice.chapter15.hashmapexample;

public class Student {
    private String name;
    private int sno;

    public Student(String name, int sno) {
        this.name = name;
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public int getSno() {
        return sno;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student) obj;
            return (name.equals(student.name)) && (sno == student.sno);
        }else return false;
    }

    @Override
    public int hashCode(){
        return sno + name.hashCode();
    }
}
