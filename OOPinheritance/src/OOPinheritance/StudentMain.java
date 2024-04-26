package OOPinheritance;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        List<Student> responses = studentManager.getAll();

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Selo");
        student2.setLastName("İscan");
        student2.setEmail("selo@etiya.com");
        student2.setPassword("selo123");
        student2.setAbout("Test");
        studentManager.addStudent(student2);

        for (Student student:responses){
            System.out.println("Kayıt olan öğrencinin adı ve soyadı: " +
                    student.getFirstName() + " " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Hakkında: " + student.getAbout());

        }


    }


}
