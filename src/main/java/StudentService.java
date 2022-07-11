import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class StudentService {

    public StudentService() {
    }

    public void randomName(Student student) {
        String FIRST_LETTER_NAME = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String LETTER_NAME = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        student.setNameStudent(FIRST_LETTER_NAME + LETTER_NAME);
    }

    public void randomSurname(Student student) {
        String FIRST_LETTER_SURNAME = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String LETTER_SURNAME = RandomStringUtils.randomAlphabetic(5).toLowerCase();
        student.setSurnameStudent(FIRST_LETTER_SURNAME + LETTER_SURNAME);
    }

    public void randomGrades(Student student) {
        student.setGradeStudent(new Random().nextInt(100));
    }
}
