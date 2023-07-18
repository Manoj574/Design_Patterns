package Prototype;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student(23, "Manoj", "abc@gmail.com", "SASTRA");
        Student student2 = student1.clone();
        System.out.println(student2.toString());

        IntelligentStudent intelligentStudent1 = new IntelligentStudent(19, "Ushodaya", "def@gmail.com", "SRIT", 200);
        IntelligentStudent intelligentStudent2 = intelligentStudent1.clone();
        System.out.println(intelligentStudent2.toString());


    }
}
