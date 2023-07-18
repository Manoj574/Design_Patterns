package Registry;

public class Student implements Prototype {
    private String id;
    private int age;
    String name;
    String email;
    String university;

    public Student(String id, int age, String name, String email, String university){
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.university = university;
    }

    public Student(Student original) {
        this.id = original.id;
        this.age = original.age;
        this.name = original.name;
        this.email = original.email;
        this.university = original.university;
    }

    public Student clone(){
        return new Student(this);
    }

    public String getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "ID:- "+this.id+"\nName:- "+this.name+"\nAge:- "+this.age+"\nEmail:- "+this.email+"\nUniversity:- "+this.university;
    }

}
