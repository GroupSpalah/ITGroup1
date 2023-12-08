package lessons.ls_12_23.ls_08_12_23;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
//@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Person {
    int age;
    String firstName;
    String lastName;
}

class TestLombok {
    public static void main(String[] args) {
//        Person person = new Person();

//        person.set

        Person person = Person
                .builder()
                .age(30)
                .firstName("John")
                .build();
    }
}
