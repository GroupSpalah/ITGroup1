package lessons.ls_08_23.ls_18_08_23;

import java.util.List;
import java.util.stream.Stream;

/**
 * Imagine You have a few sources where You can buy medicines, they're online pharmacy and local pharmacies.
 * Each source have some list of medicines that are available at the moment.
 * First, You have medicines online:
 * List<String>medicinesOnline = List.of("Askorbinka", "Nazonex", "Dekatylen", "Strepsils", "Zelenka");
 * Second, You have a list of local pharmacies with lists of medicines:
 * List<Pharmacy> pharmacies = List.of(new Pharmacy("3i", List.of("Nazonex", "Vitamin C", "Zn Supplements")),
 *                                     new Pharmacy("DS", List.of("Vitamin C", "Advil", "DoppelHerz")),
 *                                     new Pharmacy("Kopiiochka", List.of("Ibuprofen", "Vitamin C")));
 * Your tasks are:
 * - use given code snippets without modifications;
 * - create needed POJO class using Java best practices;
 * - print out all unique medicines from all sources (only medicines, You should collect them into one collection),
 * final collection should be sorted by medicine name.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> medicinesOnline = List.of("Askorbinka", "Nazonex", "Dekatylen", "Strepsils", "Zelenka");

        List<Pharmacy> pharmacies = List.of(new Pharmacy("3i", List.of("Nazonex", "Vitamin C", "Zn Supplements")),
                                                   new Pharmacy("DS", List.of("Vitamin C", "Advil", "DoppelHerz")),
                                     new Pharmacy("Kopiiochka", List.of("Ibuprofen", "Vitamin C")));

    /*    Stream<String> stringStream = pharmacies
                .stream()
                .flatMap(ph -> ph.list().stream());*/

        /*Stream<List<String>> stream = pharmacies
                .stream()
                .map(ph -> ph.list());*/

        Stream<String> stream1 = pharmacies
                .stream()
                .flatMap(ph -> ph.list().stream());

        Stream<String> stream2 = medicinesOnline.stream();

        Stream
                .concat(stream2, stream1)
                .distinct()
                .forEach(m -> System.out.println(m));



    }
}

record Pharmacy(String name, List<String> list){}
