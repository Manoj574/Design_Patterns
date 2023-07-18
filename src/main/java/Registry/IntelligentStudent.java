package Registry;

public class IntelligentStudent extends Student {

    int iq;

    public IntelligentStudent(String id, int age, String name, String email, String university, int iq){
        super(id, age, name, email, university);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent original){
        super(original);
        this.iq = original.iq;

    }


    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return super.toString()+"\nIq:- "+this.iq;
    }
}
