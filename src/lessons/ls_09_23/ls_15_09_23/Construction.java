package lessons.ls_09_23.ls_15_09_23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 Строительная компания хочет улучшить свою внутреннюю практику, внедрив новую цифровую систему.

 Первый модуль приложения — управление сотрудниками. У сотрудника есть имя, идентификатор сотрудника,
 а также должность: рабочий, супервайзер, инженер или начальник участка. Работники могут работать как на окладе,
 так и на условиях неполного рабочего времени. Работники получают заработную плату в деньгах (M) на основе следующих правил:

 Рабочие получают базовую заработную плату в размере 408 миллионов и 6 миллионов за отработанный час.

 Супервайзеры получают базовую зарплату в размере 788 миллионов, 5 миллионов в час плюс 0,5 миллиона за каждого рабочего,
 которого они контролируют.

 Инженеры получают базовую оплату в размере 700 миллионов и 40 миллионов в час. Менеджеры сайтов получают базовую
 оплату в размере 1000 миллионов и 20 миллионов в час. Работники, занятые неполный рабочий день, не получают
 базовую заработную плату, но получают двойную почасовую ставку по найму.

 Следующий модуль приложения — управление ходом строительных площадок. Существуют различные
 типы строительных площадок: жилые дома(10000), многоквартирные дома(1000000) и офисные здания(2000000).
 На каждой строительной площадке
 есть список ответственных за нее сотрудников. Прогресс на стройке начинается только в том случае,
 если один из сотрудников является начальником участка. Наконец, для отчетности компания хочет знать,
 каково среднее количество рабочих на строительной площадке офисного здания.
 Посчитать общую сумму зарплат всем рабочим
 */
public class Construction {
    private ConstructionType type;
    private List<Worker> employees;

    public Construction(ConstructionType type) {
        this.type = type;
        employees = new ArrayList<>();
    }

    public ConstructionType getType() {
        return type;
    }

    public List<Worker> getEmployees() {
        return employees;
    }

    private boolean existsSupervisor() {
        return employees
                .stream()
                .anyMatch(e -> e.eType() == EmployeeType.SUPERVISOR);
    }

    public float calculateSalary() {
        if (!existsSupervisor()) {
            throw new IllegalArgumentException();
        }

        float[] sum = new float[1];

        int count = 0;

        /*for (int i = 0; i < 10; i++) {
            count++;
        }*/

        employees
                .stream()
                .forEach(e -> {
                    EmployeeType employeeType = e.eType();

                    if (employeeType != EmployeeType.SUPERVISOR) {
                        if (e.sType() == SalaryType.FULL_TIME) {
                            sum[0] += employeeType.getBaseSalary();
                            try {
                                throw new IOException();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        } else {
                            sum[0] += employeeType.getHourSalary() * type.getConstructionTime();
                        }

                    } else {
                        int countWorkers = employees.size() - 1;

                        double value = countWorkers * 0.5;

                        if (e.sType() == SalaryType.FULL_TIME) {

                            sum[0] += employeeType.getBaseSalary() + value;
                        } else {
                            sum[0] += (employeeType.getHourSalary() * type.getConstructionTime()) + value;
                        }
                    }
                });

        return sum[0];
    }
}
