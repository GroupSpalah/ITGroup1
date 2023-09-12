package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DentalClinicService {
    private List<HistoricalRecord> records;

    public DentalClinicService() {
        this.records = new ArrayList<>();
    }

    public boolean isPatientLoyal(List<HistoricalRecord> records, LocalDate startDate, LocalDate beforeDate) {
        records
                .stream()
                .filter(hr -> hr.visit().size() > 3)
                .flatMap(hr -> hr.visit().stream())
                .filter(v -> v.localDate().isAfter(startDate) && v.localDate().isBefore(beforeDate))
                .forEach(v -> v.patient().setLoyalty(true));
        return true;
    }

    public void showTypeOfProcedure(LocalDate endDate) {
        LocalDate startDate = endDate.minusWeeks(1);
        records
                .stream()
                .flatMap(hr -> hr.visit().stream())
                .filter(v -> v.localDate().isAfter(startDate) && v.localDate().isBefore(endDate))
                .map(Visit::typeProcedures)
                .forEach(System.out::println);

    }

    public void showPatientsByStaff(DentalStaff staff, LocalDate startDate, LocalDate endDate) {
        records
                .stream()
                .flatMap(hr -> hr.visit().stream())
                .filter(v -> v.dentalStaffs().contains(staff))
                .map(Visit::patient)
                .forEach(System.out::println);

    }
}

