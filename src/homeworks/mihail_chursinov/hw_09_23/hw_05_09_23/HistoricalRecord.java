package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

import java.util.List;

public record HistoricalRecord(List<Visit> visit, List<DentalStaff> dentalStaffs, String typeProcedures,
                               String description, String toothInvolved) {
}


