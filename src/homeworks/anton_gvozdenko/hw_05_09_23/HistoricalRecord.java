package homeworks.anton_gvozdenko.hw_05_09_23;

import java.util.ArrayList;
import java.util.List;

public class HistoricalRecord {
    private List<Visit> visits;
    private List<ProcedureType> procedureTypes;//remove

    public HistoricalRecord() {
        this.visits = new ArrayList<>();
        this.procedureTypes = new ArrayList<>();
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public List<ProcedureType> getProcedureTypes() {
        return procedureTypes;
    }

}
