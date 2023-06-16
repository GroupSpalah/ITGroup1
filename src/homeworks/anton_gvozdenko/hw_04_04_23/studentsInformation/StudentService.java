package homeworks.anton_gvozdenko.hw_04_04_23.studentsInformation;

public class StudentService {
    public static boolean compareGroupNames(Student firstStudent, Student secondStudent) {
        Group firstGroup = firstStudent.getGroup();
        Group secondGroup = secondStudent.getGroup();
        String groupName = firstGroup.getGroupName();
        String groupName2 = secondGroup.getGroupName();

        boolean equalsGroupName = groupName.equals(groupName2);
        return equalsGroupName;
    }

    public static boolean compareLastNames(Student firstStudent, Student secondStudent) {

        String lastName1 = firstStudent.getLastName();
        String lastName2 = secondStudent.getLastName();

        boolean equalsLastName = lastName1.equals(lastName2);
        return equalsLastName;
    }

    public static boolean compareUniversityNames(Student firstStudent, Student secondStudent) {
        University firstUniversity = firstStudent.getUniversity();
        University secondUniversity = secondStudent.getUniversity();
        String firstUnName = firstUniversity.getUnName();
        String secondUnName = secondUniversity.getUnName();

        boolean equalsUniversityNames = firstUnName.equals(secondUnName);
        return equalsUniversityNames;
    }

}