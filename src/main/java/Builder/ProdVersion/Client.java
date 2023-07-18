package Builder.ProdVersion;

public class Client {
    public static void main(String[] args) {

        Student s = Student.getStudentBuilder()
                .setAge(19)
                .setEmail("abc@gmail.com")
                .setName("Manoj")
                .setGradYear(2021)
                .setPhoneNumber("9999999999")
                .setUniversity("SASTRA")
                .setPsp(85.5)
                .build();

        //Below line will be executed only if age is > 18 and email is not null
        System.out.println("Prototype.Student object created:- "+s);
    }
}
