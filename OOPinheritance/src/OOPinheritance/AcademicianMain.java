package OOPinheritance;

import java.util.ArrayList;
import java.util.List;

public class AcademicianMain {

    public static void main(String[] args) {

        AcademicianManager academicianManager = new AcademicianManager();
        List<Academician> responseAcademicians = academicianManager.getAll();

        Academician academician = new Academician();
        academician.setId(2);
        academician.setFirstName("Muhammed");
        academician.setLastName("İnan");
        academician.setEmail("muhammed@etiya.com");
        academician.setSection("Programlama");

        academicianManager.addAcademician(academician);

        System.out.println("Akademisyen adı ve soyadı: " + academician.getFirstName() + " " +  academician.getLastName()
                + "\n" + "Email: " + academician.getEmail() + " Bölüm: "  + academician.getSection());


        System.out.println("-------------");
        System.out.println("Update: ");

        Academician academician1 = new Academician();
        academician1.setId(2);
        academician1.setFirstName("Yagız");
        academician1.setLastName("Delibas");
        academician1.setEmail("yagız@etiya.com");
        academician1.setSection("Programlama");

        academicianManager.updateAcademician(academician1);

        System.out.println("Akademisyen adı ve soyadı: " + academician1.getFirstName() + " " +  academician1.getLastName()
                + "\n" + "Email: " + academician1.getEmail() + " Bölüm: "  + academician1.getSection());


        System.out.println("------------------------");
        System.out.println("Delete:");
        academicianManager.deleteAcademician(2);
        for (Academician academician2:responseAcademicians){
            System.out.println("Akademisyen adı ve soyadı: " + academician2.getFirstName() + " " +  academician2.getLastName()
                    + "\n" + "Email: " + academician2.getEmail() + " Bölüm: "  + academician2.getSection());
        }

    }
}
