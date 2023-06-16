package homeworks.mihail_chursinov.hw_09_05_23.task2;

/**
 * В главной программе создать объект
 * * класса Студент и 2 объекта класса Студент-контрактник (один из
 * * которых уплатил за контракт, а другой нет). Выдать информацию о
 * * студентах, затем применить к ним метод «Перевести на следующий
 * * курс» и снова выдать информацию о них.
 */

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Johnson", "DC-1", 2, 4);
        ContractStudent firstStudent = new ContractStudent("Jackson", "DC-1", 2, 4, true);
        ContractStudent secondStudent = new ContractStudent("Jackson", "DC-1", 2, 3, false);

        String testStudent = student.showInfo();
        String testStudent1 = firstStudent.showInfo();
        String testStudent2 = secondStudent.showInfo();
        System.out.println(testStudent);
        System.out.println(testStudent1);
        System.out.println(testStudent2);

        student.transferNextCourse();
        firstStudent.transferNextCourse();
        secondStudent.transferNextCourse();

        String newStudent = student.showInfo();
        String newStudent1 = firstStudent.showInfo();
        String newStudent2 = secondStudent.showInfo();

        System.out.println(newStudent);
        System.out.println(newStudent1);
        System.out.println(newStudent2);


    }
}
