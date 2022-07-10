import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Student studentFirst = new Student();
        Student studentSecond = new Student();
        StudentService studentService = new StudentService();

        studentService.randomName(studentFirst);
        studentService.randomSurname(studentFirst);
        studentService.randomGrades(studentFirst);
        studentService.setClass(studentFirst);

        studentService.randomName(studentSecond);
        studentService.randomSurname(studentSecond);
        studentService.randomGrades(studentSecond);
        studentService.setClass(studentSecond);

        List<Student> list = new ArrayList<>();
        list.add(studentFirst);
        list.add(studentSecond);
        List<Student> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameClass().equals("F")) {
                list2.add(list.get(i));
            }
        }

        int totalGrade = 0;
        for(int i = 0; i < list.size(); i++)
        {
            totalGrade += list.get(i).getGradeStudent();
            totalGrade = (totalGrade / list.size());
        }
        System.out.println(list2);
        System.out.println("The overall average mark of all students in the class = " + totalGrade);
    }
}
