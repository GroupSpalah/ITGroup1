package lessons.ls_09_23.ls_08_09_23.event_manager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CocktailParty extends Event {
    private Map<Employee, Set<CocktailType>> mapCocktails;

    public CocktailParty() {
        super(EventType.COCKTAIL_PARTY);
        this.mapCocktails = new HashMap<>();
    }

    public void addCocktailToEmployee(Employee employee, CocktailType cocktailType) {
        if (mapCocktails.containsKey(employee)) {
            mapCocktails.get(employee).add(cocktailType);
        } else {
            mapCocktails.put(employee, new HashSet<>(Set.of(cocktailType)));
        }
    }
}
