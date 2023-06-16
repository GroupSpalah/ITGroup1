package homeworks.mihail_chursinov.hw_09_05_23.task2;

/**
 * Создать класс Студент со свойствами: ФИО, факультет, курс, минимальная оценка по экзаменам за последнюю сессию (по 5-ти бальной
 * системе). Определить методы: «Перевести на следующий
 * курс», увеличивающий курс на 1, если минимальная оценка не менее 3,
 * иначе не делающий ничего, а также «Стипендия», возвращающий
 * стипендию (в грн): 0 грн, если минимальная оценка не выше 3, 200 грн,
 * если минимальная оценка равна 4 и 300 грн, если минимальная оценка
 * равна 5. Определить также метод «Информация», который возвращает
 * строку, содержащую информацию о студенте: ФИО, факультет, курс,
 * минимальная оценка по экзаменам и начисленную стипендию.
 * Создать также класс наследник Студент-контрактник, в котором будет
 * дополнительный логический параметр – уплачен ли контракт и переопределены методы «Перевести на следующий курс», увеличивающий курс
 * на 1, если минимальная оценка не менее 3 и за контракт уплачено, а
 * также «Стипендия» возвращающий всегда 0 грн.
 * В главной программе создать объект
 * класса Студент и 2 объекта класса Студент-контрактник (один из
 * которых уплатил за контракт, а другой нет). Выдать информацию о
 * студентах, затем применить к ним метод «Перевести на следующий
 * курс» и снова выдать информацию о них.
 */

public class Student {
    public static final int MOONEY_FOR_FIVE = 300;
    public static final int MOONEY_FOR_FOUR = 200;
    public static final int PLUS_ONE_COURSE = 1;
    private String lastName;
    private String faculty;
    private int course;
    private int minRating;

    public Student(String lastName, String faculty, int course, int minRating) {
        this.lastName = lastName;
        this.faculty = faculty;
        this.course = course;
        this.minRating = minRating;
    }

    public int transferNextCourse() {
        if (minRating >= 3) {
            return course = course + PLUS_ONE_COURSE;
        } else {
            return 0;
        }
    }

    public int getScholarship() {
        if (minRating == 5) {
            return MOONEY_FOR_FIVE;
        } else if (minRating == 4) {
            return MOONEY_FOR_FOUR;
        } else {
            return 0;
        }
    }

    public String showInfo() {
        return "Last name " + lastName + "\tFaculty " + faculty + "\tCourse " + course + "\tMinimum exam grade " + minRating +
                "\tAccrued scholarship " + getScholarship();
    }
}
