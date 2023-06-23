package homeworks.mihail_chursinov.hw_05_23.hw_09_05_23.task2;

/**
 * Создать также класс наследник Студент-контрактник, в котором будет
 * * дополнительный логический параметр – уплачен ли контракт и переопределены методы «Перевести на следующий курс», увеличивающий курс
 * * на 1, если минимальная оценка не менее 3 и за контракт уплачено, а
 * * также «Стипендия» возвращающий всегда 0 грн.
 */

public class ContractStudent extends Student {
    private boolean isPaid;

    public ContractStudent(String lastName, String faculty, int course, int minRating, boolean isPaid) {
        super(lastName, faculty, course, minRating);
        this.isPaid = isPaid;
    }

    @Override
    public int transferNextCourse() {
        if (isPaid) {
            return super.transferNextCourse();
        }
        return 0;
    }

    @Override
    public int getScholarship() {
        return 0;
    }
}
