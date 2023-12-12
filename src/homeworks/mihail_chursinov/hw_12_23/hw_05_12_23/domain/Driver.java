package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain;

import java.util.List;

public record Driver(int id, String firstName, String lastName, int age, Qualification qualification,
                     List<Truck> trucks) {

}
