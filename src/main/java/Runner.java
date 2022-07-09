import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Runner {
    public static void main(String[] args) {
        Student student = new Student();




        student.setGradeStudent(new Random().nextInt(100));
        student.setNameClass("N");
        String firstLetter = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String letters = RandomStringUtils.randomAlphabetic(5).toLowerCase();

        student.setNameStudent(firstLetter+letters);

        String firstLetterSurname = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String lettersSurname = RandomStringUtils.randomAlphabetic(5).toLowerCase();

        student.setSurnameStudent(firstLetterSurname+lettersSurname);

        List <Student> list= new ArrayList<>();
        list.add(student);

//        List<Student> newList = list.stream().filter(student -> student.getNameClass().equals("A")).collect(Collectors.toList());

        List<Student> list2 = new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            if (list.get(i).getNameClass().equals("N")) {
                list2.add(list.get(i));
            }

        }
        System.out.println(list2);
    }

}

