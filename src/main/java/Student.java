import java.util.Objects;

public class Student {
    private String nameClass;
    private String nameStudent;
    private String surnameStudent;
    private int gradeStudent;


    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Student() {
    }

    public Student(String nameStudent, String surnameStudent, int gradeStudent) {
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
        this.gradeStudent = gradeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public int getGradeStudent() {
        return gradeStudent;
    }

    public void setGradeStudent(int gradeStudent) {
        this.gradeStudent = gradeStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", surnameStudent='" + surnameStudent + '\'' +
                ", gradeStudent=" + gradeStudent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gradeStudent == student.gradeStudent && Objects.equals(nameStudent, student.nameStudent) && Objects.equals(surnameStudent, student.surnameStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStudent, surnameStudent, gradeStudent);
    }
}
