package lessons.ls_09_23;

import java.util.List;

public class ReferenceOnConstructor {
    public static void main(String[] args) {
        List<ConstMan> men = List.of(
                new ConstMan("John", 23),
                new ConstMan("Jack", 25),
                new ConstMan("Ben", 22)
        );

        men
                .stream()
                .map(man -> new ConstChild(man))
                .forEach(System.out::println);

        men
                .stream()
                .map(ConstChild::new)
                .forEach(System.out::println);
    }
}

record ConstMan(String name, int age) {

}

record ConstChild(String name, int age) {
    public ConstChild(ConstMan constMan) {
        this(constMan.name(), constMan.age());
    }
}


