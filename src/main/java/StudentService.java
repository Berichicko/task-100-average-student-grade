import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class StudentService extends Student {
    private final String FIRST_LETTER_SURNAME = RandomStringUtils.randomAlphabetic(1).toUpperCase();
    private final String LETTER_SURNAME = RandomStringUtils.randomAlphabetic(5).toLowerCase();
    private final String FIRST_LETTER_NAME = RandomStringUtils.randomAlphabetic(1).toUpperCase();
    private final String LETTER_NAME = RandomStringUtils.randomAlphabetic(5).toLowerCase();


    public StudentService() {
    }

    public StudentService(String nameStudent, String surnameStudent, int gradeStudent) {
        super(nameStudent, surnameStudent, gradeStudent);
    }

    public void setClass(Student student){
       student.setNameClass("F");
    }

    public void randomName(Student student) {
        student.setNameStudent(FIRST_LETTER_NAME + LETTER_NAME);
    }

    public void randomSurname(Student student) {
        student.setSurnameStudent(FIRST_LETTER_SURNAME + LETTER_SURNAME);
    }

    public void randomGrades(Student student) {
        student.setGradeStudent(new Random().nextInt(100));
    }
}





