package OOPinheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AcademicianManager {


    private List<Academician> academicians;

    public AcademicianManager(){
        academicians = new ArrayList<>();
        Academician academician = new Academician();
        academician.setId(1);
        academician.setFirstName("Engin");
        academician.setLastName("Demirog");
        academician.setEmail("engin@kodlamaio.com");
        academician.setSection("Kodlama");
        academician.setCreatedDate(LocalDateTime.now());


        academicians.add(academician);
    }

    public List<Academician> getAll(){
        return academicians;
    }

    public void addAcademician(Academician academician){
        academician.setCreatedDate(LocalDateTime.now());
        academicians.add(academician);
    }

    public void deleteAcademician(int id){
        Iterator<Academician> academicianIterator = academicians.iterator();
        while (academicianIterator.hasNext()){
            Academician academician = academicianIterator.next();
            if (academician.getId() == id){
                academician.setDeletedDate(LocalDateTime.now());
                academicianIterator.remove();
            }
        }
    }

    public void updateAcademician(Academician academician){
        for (Academician updateAcademician:academicians){
            if (updateAcademician.getId() == academician.getId()){
                updateAcademician.setUpdatedDate(LocalDateTime.now());
                updateAcademician.setId(academician.getId());
                updateAcademician.setFirstName(academician.getFirstName());
                updateAcademician.setLastName(academician.getLastName());
            }
        }


    }


}