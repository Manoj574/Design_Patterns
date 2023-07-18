package Registry;

import java.util.HashMap;

public class StudentRegister {

    public HashMap<String, Student> hashMap = null;
    public static StudentRegister instance = null;
    private StudentRegister(){
        hashMap = new HashMap<>();
    }

    public static StudentRegister getInstance(){
        if(instance == null){
            synchronized(StudentRegister.class){
                if(instance == null){
                    instance = new StudentRegister();
                }
            }
        }
        return instance;
    }

    public void add(String key, Student student){
        hashMap.put(key, student);
    }

    public Student get(String key){
        return hashMap.get(key);
    }

}
