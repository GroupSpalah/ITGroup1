package homeworks.mihail_chursinov.hw_04_04_23;

public class University {
    private String nameUniversity;
    private int amountGroup;
    private String dateOfEstablishment;

    public University(String nameUniversity, int amountGroup, String dateOfEstablishment) {
        this.nameUniversity = nameUniversity;
        this.amountGroup = amountGroup;
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public int getAmountGroup() {
        return amountGroup;
    }

    public String getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void showInfoUniversity() {
        System.out.println("Name of the university:" + "\t" + nameUniversity + "," + "\tamount of groups:" + "\t" + amountGroup + ","
                + "\tdate of establishment:" + "\t" + dateOfEstablishment);
    }

}
