package homeworks.anton_gvozdenko.hw_05_09_23;

import java.util.ArrayList;
import java.util.List;

public class HistoricalRecord {
    private List<Visit> visits;
    private List<ProcedureType> procedureTypes;
    private int countOfVisits;

    public HistoricalRecord(int countOfVisits) {
        this.visits = new ArrayList<>();
        this.countOfVisits = countOfVisits;
        this.procedureTypes = new ArrayList<>();
    }


    public List<Visit> getVisits() {
        return visits;
    }

    public int getCountOfVisits() {
        return countOfVisits;
    }

    public List<ProcedureType> getProcedureTypes() {
        return procedureTypes;
    }
}
