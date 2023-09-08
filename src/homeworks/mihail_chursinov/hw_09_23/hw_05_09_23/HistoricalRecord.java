package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

import java.util.List;

public record HistoricalRecord(List<Visit> visits, List<DentalStaff> dentalStaffs, List<TypeProcedure> typeProcedures,
                               String description, String toothInvolved) {
}


