package homeworks.mihail_chursinov.hw_04_04_23;

public class Test {
    public static void main(String[] args) {

        Group first01 = new Group("first01", 32);
        Group first02 = new Group("first02", 27);
        Group first03 = new Group("first03", 30);
        University TSKM = new University("TSKM", 3, "1967");

        Student john = new Student("John", "Craig", 22, Sex.MALE, first01, TSKM);
        Student mike = new Student("Mike", "Tyson", 20, Sex.MALE, first01, TSKM);
        Student stefan = new Student("Stefan", "Johnson", 21, Sex.MALE, first02, TSKM);
        Student ilona = new Student("Ilona", "Mur", 22, Sex.FEMALE, first03, TSKM);

        john.showInfo();
        System.out.println("---------------------------------------------------------------------------------");
        mike.showInfo();
        System.out.println("---------------------------------------------------------------------------------");
        stefan.showInfo();
        System.out.println("---------------------------------------------------------------------------------");
        ilona.showInfo();


        boolean isEqualGroups = StudentService.compareGroup(john, ilona);
        System.out.println(isEqualGroups);

        boolean isEqualUniversity = StudentService.compareUniversity(stefan, mike);
        System.out.println(isEqualUniversity);

        boolean isEqualLastName = StudentService.compareLastName(john, stefan);
        System.out.println(isEqualLastName);

    }
}
