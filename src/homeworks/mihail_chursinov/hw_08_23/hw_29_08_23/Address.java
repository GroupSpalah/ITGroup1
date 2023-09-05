package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

public record Address(String country, String city, String street, int houseStreet) {
    public Address(String country, String street) {
        this(country, null, street, 0);
    }
}
