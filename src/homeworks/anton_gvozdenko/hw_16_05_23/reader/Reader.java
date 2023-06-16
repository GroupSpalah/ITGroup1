package homeworks.anton_gvozdenko.hw_16_05_23.reader;

public  class Reader {
    private String firstName;
    private String lastName;
    private String surName;
    private int number;
    private String faculty;
    private double birthDate;
    private int phoneNumb;

    public Reader(String firstName, String lastName, String surName, int number, String faculty, double birthDate, int phoneNumb) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.number = number;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumb = phoneNumb;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getBirthDate() {
        return birthDate;
    }

    public int getPhoneNumb() {
        return phoneNumb;
    }
    public void takeBook(){};
    public void returnBook(){};

    public void takeBook(int book){
        System.out.println("Petrov V.V. takes + " + book + "\tbooks");
    }
    public void takeBook(String... names){
StringBuilder builder = new StringBuilder("Petrov V.V takes books");
        for (int i = 0; i <names.length ; i++) {
            builder.append(i);
        }
        System.out.println(builder);
    }
}
