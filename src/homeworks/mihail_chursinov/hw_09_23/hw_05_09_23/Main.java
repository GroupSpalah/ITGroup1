package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DentalClinicService dentalClinicService = new DentalClinicService();
        LocalDate endDate = LocalDate.now();

        Patient patient1 = new Patient("Michael", 1245, true);
        Patient patient2 = new Patient("John", 3243, false);
        Patient patient3 = new Patient("Ann", 5596, true);

        Visit visit1 = new Visit(patient1, List.of(DentalStaff.DENTIST),
                LocalDate.of(2023, 11, 12), "preventive");
        Visit visit2 = new Visit(patient2, List.of(DentalStaff.DENTAL),
                LocalDate.of(2023, 11, 8), "preventive");
        Visit visit3 = new Visit(patient3, List.of(DentalStaff.X_RAY_TECHNICAL),
                LocalDate.of(2023, 10, 18), "preventive");

        HistoricalRecord historicalRecord1 = new HistoricalRecord(List.of(visit1)
                , "preventive", "review", "yes");
        HistoricalRecord historicalRecord2 = new HistoricalRecord(List.of(visit2)
                , "preventive", "review", "yes");
        HistoricalRecord historicalRecord3 = new HistoricalRecord(List.of(visit2)
                , "preventive", "review", "yes");

//        dentalClinicService.isPatientLoyal(List.of(historicalRecord1),
//                LocalDate.of(2023, 12, 10),
//                LocalDate.of(2023, 11, 15));

        dentalClinicService.showTypeOfProcedure(endDate);

    }
}
