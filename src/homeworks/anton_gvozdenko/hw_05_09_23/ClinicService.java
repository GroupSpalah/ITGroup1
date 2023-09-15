package homeworks.anton_gvozdenko.hw_05_09_23;


import java.time.LocalDate;
import java.time.Month;

import java.util.ArrayList;
import java.util.List;

public class ClinicService {
    public static void main(String[] args) {
        HistoricalRecord record = new HistoricalRecord();

        Visit visit = new Visit(new Patient("John", 123), LocalDate.of(2023, Month.AUGUST,
                2), ProcedureType.X_RAY_PROCEDURE);
        Employee employee = new Employee("Ben", Specialisation.X_RAY_TECHNICIAN);

        List<HistoricalRecord> recordList = List.of(record);

        List<Visit> visits = List.of(visit);
        List<Employee> employees = List.of(employee);
        isPatientLoyal(recordList, LocalDate.of(2023, Month.JUNE, 1)
                , LocalDate.now());
        showPatientByEmployee(recordList, new Employee("Ben"
                , Specialisation.X_RAY_TECHNICIAN));
        showProcedure(recordList, 7);

    }

    List<HistoricalRecord> records;

    public ClinicService() {
        this.records = new ArrayList<>();
    }

    public static void isPatientLoyal(List<HistoricalRecord> records, LocalDate startDate, LocalDate beforeDate) {
        records
                .stream()
                .filter(hr -> hr.getVisits().size() > 3)
                .flatMap(hr -> hr.getVisits().stream())
                .filter(visit -> visit.getDate().isAfter(startDate) && visit.getDate()
                        .isBefore(beforeDate))
                .forEach(v -> v.getPatient().setLoyalty(true));
    }

    public static void showProcedure(List<HistoricalRecord> records, int countDays) {
        LocalDate date = LocalDate.now().minusDays(countDays);
        records
                .stream()
                .flatMap(record -> record.getVisits().stream())
                .filter(visit -> visit.getDate().isAfter(date))
                .forEach(visit -> System.out.println(visit.getProcedureType()));


    }

    public static void showPatientByEmployee(List<HistoricalRecord> records, Employee employee) {
        records
                .stream()
                .flatMap(record -> record.getVisits().stream())
                .filter(visit -> visit.getEmployees().contains(employee))
                .forEach(visit -> System.out.println(visit.getPatient()));
    }

}







