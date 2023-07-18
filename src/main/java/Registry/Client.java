package Registry;

public class Client {
    public static void main(String[] args) {

        Student student1 = new Student("123" ,23, "Manoj", "abc@gmail.com", "SASTRA");

        IntelligentStudent intelligentStudent1 = new IntelligentStudent("456", 19, "Ushodaya", "def@gmail.com", "SRIT", 200);

        StudentRegister studentRegister = StudentRegister.getInstance();
        studentRegister.add(student1.getId(), student1);
        studentRegister.add(intelligentStudent1.getId(), intelligentStudent1);

        System.out.println(studentRegister.get(student1.getId()));
        System.out.println(studentRegister.get(intelligentStudent1.getId()));

    }
}
