package Builder.ProdVersion;

/*
We need to create object only if age is > 18 and email is not null
*/

public class Student {

    String name;
    String email;
    String phoneNumber;
    String university;
    int age;
    int gradYear;
    double psp;

    public Student(StudentBuilder sb) {
        if(sb.getEmail() == null){
            throw new RuntimeException("Email cannot be null");
        }
        if (sb.getAge() < 18) {
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

    public static StudentBuilder getStudentBuilder() {
        return new StudentBuilder();
    }


    static class StudentBuilder {
        String name;
        String email;
        String phoneNumber;
        String university;
        int age;
        int gradYear;
        double psp;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }
}
