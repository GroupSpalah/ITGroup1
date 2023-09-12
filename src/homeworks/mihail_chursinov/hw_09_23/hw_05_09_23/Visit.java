package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

import java.time.LocalDate;
import java.util.List;

public record Visit(Patient patient, List<DentalStaff> dentalStaffs, LocalDate localDate, String typeProcedures) {

}
