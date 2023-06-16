package homeworks.mihail_chursinov.hw_06_05_23.task1.task2;

/**
 * Создать также класс наследник Ноутбук, с дополнительным свойством.
 * * Продолжительность автономной работы (в минутах) и переопределить
 * * методы: метод «Стоимость» возвращает число, равное стоимости обычного компьютера +
 * * количество минут автономной работы / 10, а метод
 * * «Пригодность» возвращает истину, тогда когда и ноутбук пригоден как
 * * обычный компьютер, и Продолжительность автономной работы не
 * * меньше 60 минут.
 */

public class Laptop extends Computer {
    public static final int CONST_PRICE = 10;
    public static final int CONST_MATCH = 60;
    private int durationWork;


    public Laptop(int processorFrequency, int memory, int numberCores, int hardDisk, int durationWork) {
        super(processorFrequency, memory, numberCores, hardDisk);
        this.durationWork = durationWork;
    }

    public int getDurationWork() {
        return durationWork;
    }

    @Override
    public int countComputer() {
        return super.countComputer() + getDurationWork() / CONST_PRICE;
    }

    @Override
    public boolean matchComputer() {
        return super.matchComputer() && getDurationWork() >= CONST_MATCH;
    }

    @Override
    public String showInfo() {
        String info = "Processor frequency " + getProcessorFrequency() + "\tNumber of Cores " + getNumberCores() +
                "\tMemory " + getMemory() + "\tHard disk  " + getHardDisk() + "\tPrice " + countComputer() +
                "\tMeet the requirements of the computer: " + matchComputer() + "\tLaptop battery life: " + durationWork;
        return info;
    }
}
