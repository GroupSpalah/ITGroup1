package homeworks.mihail_chursinov.hw_12_23.hw_01_12_23;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Notebook notebook = new Notebook(0, "A23", "Apple", "2023-01-01",
                16, 256, "CPU11");
        Notebook notebook1 = new Notebook(6, "A43", "LG", "2023-12-10",
                8, 256, "CPU1");

        //ServiceNotebook.add(notebook);
        //ServiceNotebook.showForID(4);
        //ServiceNotebook.showAll();
        //ServiceNotebook.deleteForID(1);
        //ServiceNotebook.deleteAll();
        //ServiceNotebook.updateForId(notebook1);
        //ServiceNotebook.showForModel("A43");
        //ServiceNotebook.showForDate("2023-01-01");
        //ServiceNotebook.showForRamAndSsd(8, 256);
        ServiceNotebook.showForCpu("CPU3");
    }
}
