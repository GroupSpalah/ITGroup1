package homeworks.mihail_chursinov.hw_04_04_23;

public class StudentService {


    public static boolean compareGroup(Student student1, Student student2) {
        Group group1 = student1.getGroup();
        Group group2 = student2.getGroup();

        String name1 = group1.getNameGroup();
        String name2 = group2.getNameGroup();
        boolean equalGroups = name1.equals(name2);

        return equalGroups;

    }

    public static boolean compareUniversity(Student student1, Student student2) {
        University university1 = student1.getUniversity();
        University university2 = student2.getUniversity();

        String name1 = university1.getNameUniversity();
        String name2 = university2.getNameUniversity();

        boolean equalUniversity = name1.equals(name2);

        return equalUniversity;

    }

    public static boolean compareLastName(Student student1, Student student2) {
        String lastName1 = student1.getLastName();
        String lastName2 = student2.getLastName();

        return lastName1.equals(lastName2);

    }
}
