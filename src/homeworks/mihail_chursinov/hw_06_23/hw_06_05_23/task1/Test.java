package homeworks.mihail_chursinov.hw_06_23.hw_06_05_23.task1;

/**
 * В главной программе создать объект
 * * класса Автомобиль с максимальной скоростью 140 км/ч и класса
 * * Представительский автомобиль с максимальной скоростью 160 км/ч.
 * * Вывести на экран информацию об автомобилях. Обновить
 * * модели автомобилей и снова вывести информацию о них.
 */

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Fiat", 140);
        ExecutiveCar executiveCar = new ExecutiveCar("Mercedes", 160);

        String testCar = car.showInfo();
        System.out.println(testCar);
        String testExecutive = executiveCar.showInfo();
        System.out.println(testExecutive);

        int result = car.updateModel();
        System.out.println("New model " + result);
        String newCar = car.showInfo();
        System.out.println(newCar);

        System.out.println("----------------------------------------------------------");

        int result1 = executiveCar.updateModel();
        System.out.println("New model " + result1);
        String newExe = executiveCar.showInfo();
        System.out.println(newExe);

    }
}
