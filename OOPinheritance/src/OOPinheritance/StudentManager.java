package OOPinheritance;


import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students;

    public StudentManager() {

        students = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Kübra");
        student.setLastName("Bozalp");
        student.setEmail("kubra@etiya.com");
        student.setPassword("123kubra");
        student.setAbout("Test");
        students.add(student);

    }

    public List<Student> getAll(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}