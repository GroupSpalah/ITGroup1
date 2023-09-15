package lessons.ls_09_23.ls_15_09_23;

import java.util.ArrayList;
import java.util.List;

public class ConstructionCompany {
    private List<Construction> constructions;

    public ConstructionCompany() {
        constructions = new ArrayList<>();
    }

    public double getAverageWorkers(ConstructionType type) {
        return constructions
                .stream()
                .filter(construction -> construction.getType() == type)//Stream<Construction>
                .mapToInt(constr -> constr.getEmployees().size()).average()//Stream<employees.size()>
                .getAsDouble();
    }
}
