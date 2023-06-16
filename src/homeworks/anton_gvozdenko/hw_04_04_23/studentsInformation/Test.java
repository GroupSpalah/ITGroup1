package homeworks.anton_gvozdenko.hw_04_04_23.studentsInformation;



public class Test {
    public static void main(String[] args) {
        Group history = new Group("history");
        Group math = new Group("math");
        University dnu = new University("dnu");
        University dniproTech = new University("dniproTech");
        Student Steven = new Student(22, "Steven", "Johnson", Sex.MALE, math, dnu);
        Student Bob = new Student(20, "Bob", "Stevenson", Sex.MALE, history, dniproTech);

        boolean isEqualLastName = StudentService.compareLastNames(Steven, Bob);
        System.out.println(isEqualLastName);
        boolean isEqualGroupNames = StudentService.compareGroupNames(Steven, Bob);
        System.out.println(isEqualGroupNames);
        boolean isEqualUniversityName = StudentService.compareUniversityNames(Steven, Bob);
        System.out.println(isEqualUniversityName);

        Steven.showInfo();
        Bob.showInfo();

    }
}
