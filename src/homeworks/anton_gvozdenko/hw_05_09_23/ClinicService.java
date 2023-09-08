package homeworks.anton_gvozdenko.hw_05_09_23;


import java.time.LocalDate;
import java.time.Month;

import java.util.ArrayList;


import java.util.List;

import java.util.stream.Stream;

public class ClinicService {
    public static void main(String[] args) {
        /*HistoricalRecord record = new HistoricalRecord(2);
        Visit visit = new Visit(new Patient("John", 123), LocalDate.of(2023, Month.AUGUST,
                2), ProcedureType.X_RAY_PROCEDURE);
        Employee employee = new Employee("Ben", Specialisation.X_RAY_TECHNICIAN);
        isPatientLoyal(record, LocalDate.of(2023, Month.JUNE, 1)
                , LocalDate.now());
        List<HistoricalRecord> recordList = List.of(record);
        List<Visit> visits = List.of(visit);
        List<Employee> employees = List.of(employee);*/
    }

    List<HistoricalRecord> records;

    public ClinicService() {
        this.records = new ArrayList<>();

    }

    public static boolean isPatientLoyal(List<HistoricalRecord> records, LocalDate startDate, LocalDate beforeDate) {
      /*   records
                .stream()
                .filter(record -> record.getCountOfVisits() >= 3 &&
                        record.getVisits().
                                stream().
                                filter(visit -> visit.getDate().isAfter(startDate) && visit.getDate()
                                        .isBefore(beforeDate))).forEach(rec -> System.out.println(rec));*/

         records
                 .stream()
                 .filter(hr -> hr.getVisits().size() > 3)
                 .flatMap(hr -> hr.getVisits().stream())
                 .filter(visit -> visit.getDate().isAfter(startDate) && visit.getDate()
                         .isBefore(beforeDate))
                 .forEach(v -> v.getPatient().setLoyalty(true));

        return true;
    }

    public void showProcedure(List<HistoricalRecord> records, LocalDate startDate, LocalDate endDate) {
      /*  records
                .stream()
                .filter(record -> record.getProcedureTypes() && record.getVisits()
                        .stream()
                        .filter(visit -> visit.getDate().isAfter(startDate) && visit.getDate().isBefore(endDate)*/

    }

}






