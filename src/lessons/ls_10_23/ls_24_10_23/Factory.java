package lessons.ls_10_23.ls_24_10_23;

/*Создать приложение Фабрика.
        Фабрика изготавливает товары и изготовление
        каждого изделия занимает определенное время и
        имеет цикл с этапами(каждый этап занимает свое время).
        Пользователь заказывает изделие и в любой момент может спросить
        о состоянии его выполнения и имя рабочего.
        Каждый цикл изготовления необходимо писать в файл, который называется
        ("Название изделия" + имя рабочего).
        Заказчик может отказаться от заказанного изделия, тогда в файл
        необходимо добавить причину.
        Заказчик может заказать несколько однотипных деталей, тогда в
        название необходимо добавить количество деталей.

      */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Factory {

    public static void main(String[] args) throws InterruptedException, IOException {
        Good good = new Good("Bycicle")
                .addAction(new Frame())
                .addAction(new Motor())
                .addAction(new Wheel());

        Worker worker = new Worker(good, 10, "Fedor");

        Thread.sleep(500);

//        worker.interruptThread("Bad quality");

        worker.showLastStage();
    }
}

class Worker implements Runnable {

    private Good good;
    private Thread thread;
    private int count;

    public Worker(Good good, int count, String name) {
        this.count = count;
        this.good = good;
        thread = new Thread(this, name.concat(good.getName()));
        thread.start();
    }


    @Override
    public void run() {

        try {

            FactoryService.createFile();

            good.getStages().forEach(l -> {
                try {
                    l.install(count);
                } catch (InterruptedException e) {
                    thread.interrupt();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showLastStage() {
        try {
            FactoryService.findLastStage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void interruptThread(String reasonStop) {

        try {
            Files.write(Paths.get(FactoryService.DIR + thread.getName() + FactoryService.EXTENSION_TXT),
                    reasonStop.getBytes(), StandardOpenOption.APPEND);

            thread.interrupt();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Good {

    private List<Goodable> stages;

    private String name;

    public Good(String name) {
        stages = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Good addAction(Goodable goodable) {
        stages.add(goodable);

        return this;
    }

    public List<Goodable> getStages() {
        return stages;
    }
}

interface Goodable {

    void install(int count) throws InterruptedException;

    default void writeLog() {

        String log = "Stage " + this.getClass().getSimpleName() + " is completed. Woker = " +
                Thread.currentThread().getName() + "\n";

        Path path = Paths.get(FactoryService.DIR + Thread.currentThread().getName() +
                FactoryService.EXTENSION_TXT);

        try {
            Files.write(path, log.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


class Frame implements Goodable {

    @Override
    public void install(int count) throws InterruptedException {

        Thread.sleep(1000 * count);

        writeLog();

    }

}

class Motor implements Goodable {

    @Override
    public void install(int count) throws InterruptedException {

        Thread.sleep(1000 * count);

        writeLog();

    }

}

class Wheel implements Goodable {

    @Override
    public void install(int count) throws InterruptedException {

        Thread.sleep(1000 * count);

        writeLog();

    }

}

class FactoryService {

    public static final String DIR = "./Stages/";

    public static final String EXTENSION_TXT = ".txt";

    public static void findLastStage() throws IOException {

        Path path = Paths.get(DIR + Thread.currentThread().getName() + EXTENSION_TXT);

        List<String> logs = Files.readAllLines(path);

        System.out.println(logs.get(logs.size() - 1));
    }

    public static void createFile() throws IOException {

        String threadName = Thread.currentThread().getName();

        if (!Files.list(Paths.get(DIR)).anyMatch(dir -> dir.toString().contains(threadName))) {
            Files.createFile(Paths.get(DIR + threadName + EXTENSION_TXT));
        }
    }

}

