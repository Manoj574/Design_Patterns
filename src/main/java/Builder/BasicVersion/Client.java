package Builder.BasicVersion;

public class Client {
    public static void main(String[] args) {

        StudentBuilder sb = new StudentBuilder();
        sb.setAge(18);
        sb.setEmail("abc@gmail.com");
        sb.setName("Manoj");
        sb.setGradYear(2021);
        sb.setPhoneNumber("9999999999");
        sb.setUniversity("SASTRA");
        sb.setPsp(85.5);

        Student s = new Student(sb);
        System.out.println("Student object created:-"+s);
    }
}
