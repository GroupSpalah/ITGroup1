package homeworks.mihail_chursinov.hw_06_05_23.task1.task2;

/**
 * Создать класс Компьютер со свойствами: Частота процессора (в МГц),
 * количество ядер, объем памяти (в МБ), объем жесткого диска (в ГБ).
 * Определить два метода: «Стоимость», возвращающую
 * примерную расчетную стоимость компьютера, рассчитываемую по
 * формуле. Частота процессора * количество ядер / 100 + количество
 * памяти / 80 + объем жесткого диска / 20 и логический метод «Пригодность»,
 * возвращающий истину (true), если частота процессора не менее
 * 2000 МГц, количество ядер не менее 2, объем памяти не менее 2048 МБ,
 * и объем жесткого диска не менее 320 Гб. Определить также метод
 * «Информация», который возвращает строку, содержащую информацию
 * о компьютере: частоту процессора, количество ядер, объем памяти,
 * объем жесткого диска, стоимость и пригодность для наших нужд.
 * Создать также класс наследник Ноутбук, с дополнительным свойством.
 * Продолжительность автономной работы (в минутах) и переопределить
 * методы: метод «Стоимость» возвращает число, равное стоимости обычного компьютера +
 * количество минут автономной работы / 10, а метод
 * «Пригодность» возвращает истину, тогда когда и ноутбук пригоден как
 * обычный компьютер, и Продолжительность автономной работы не
 * меньше 60 минут. В главной программе
 * создать обычный компьютер и ноутбук и вывести информацию о них.
 */

public class Computer {
    public static final int FIRST_COUNT = 100;
    public static final int SECOND_COUNT = 80;
    public static final int THIRD_COUNT = 20;
    public static final int FIRST_MATCH = 320;
    public static final int SECOND_MATCH = 2;
    public static final int THIRD_MATCH = 2048;
    public static final int FOURTH_MATCH = 320;
    private int processorFrequency;
    private int numberCores;
    private int memory;
    private int hardDisk;

    public Computer(int processorFrequency, int memory, int numberCores, int hardDisk) {
        this.processorFrequency = processorFrequency;
        this.memory = memory;
        this.numberCores = numberCores;
        this.hardDisk = hardDisk;
    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public int getMemory() {
        return memory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public int countComputer() {
        return (processorFrequency * numberCores) / FIRST_COUNT + memory / SECOND_COUNT + hardDisk / THIRD_COUNT;
    }

    public boolean matchComputer() {
        return processorFrequency >= FIRST_MATCH && numberCores >= SECOND_MATCH && memory >= THIRD_MATCH && hardDisk >= FOURTH_MATCH;
    }

    public String showInfo() {
        return "Processor frequency " + processorFrequency + "\tNumber of Cores " + numberCores +
                "\tMemory " + memory + "\tHard disk  " + hardDisk + "\tPrice " + countComputer() +
                "\tMeet the requirements of the computer: " + matchComputer();
    }

}
