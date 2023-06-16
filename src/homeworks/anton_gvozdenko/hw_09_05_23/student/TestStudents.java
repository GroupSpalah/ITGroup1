package homeworks.anton_gvozdenko.hw_09_05_23.student;

public class TestStudents {
    public static void main(String[] args) {
        Student student = new Student("John", "Steven", "Johnson", "Economy", 2, 4);
        Contractor contractor = new Contractor("Steven", "Andrew", "Strange", "Math", 1
                , 3, false);

        student.showStipend();
        student.getCourse();
        student.showInfo();
        contractor.getFaculty();
        contractor.transferCourse();
        contractor.showInfo();
    }
}
