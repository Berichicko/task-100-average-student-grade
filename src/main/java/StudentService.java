import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class StudentService {

    public StudentService() {
    }

    public void randomName(Student student) {
        String firstLetterName = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String letterName = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        student.setNameStudent(firstLetterName + letterName);
    }

    public void randomSurname(Student student) {
        String firstLetterSurname = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String letterSurname = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        student.setSurnameStudent(firstLetterSurname + letterSurname);
    }

    public void randomGrades(Student student) {
        student.setGradeStudent(new Random().nextInt(100));
    }
}
