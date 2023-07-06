package Builder.BasicVersion;

//We need to create object only if age is > 18
public class Student {

    String name;
    String email;
    String phoneNumber;
    String university;
    int age;
    int gradYear;
    double psp;

    public Student(StudentBuilder sb){
        if(sb.getAge() < 18){
            throw new RuntimeException("Age is less than 18");
        }
        this.age = sb.getAge();
        this.email = sb.getEmail();
        this.name = sb.getName();
        this.phoneNumber = sb.getPhoneNumber();
        this.university = sb.getUniversity();
        this.gradYear = sb.getGradYear();
        this.psp = sb.getPsp();
    }
}
