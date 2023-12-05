package homeworks.anton_gvozdenko.hw_01_12_23;

import homeworks.anton_gvozdenko.hw_01_12_23.dao.impl.NotebookDAOImpl;

import java.sql.SQLException;

public class TestNotebook {
    public static void main(String[] args) throws SQLException {
        NoteBook noteBook = new NoteBook("Ideapad", "Lenovo", "2022-03-03", 4,
                1000, "AMD", 8);
      /* DbConnector.showAllAddresses();
        DbConnector.deleteById(1);
        DbConnector.insert(noteBook);
        DbConnector.update(noteBook);
        DbConnector.showByID(3);*/
        /* DbConnector.delete();*/
        /* DbConnector.updateById(noteBook,2);*/
     /*   DbConnector.showByModel("Nitro");
        DbConnector.showByDate("2023-01-01");*/
        /* DbConnector.showByRamSsd(16,500);*/
        NotebookDAOImpl.showByCpu("Apple_m1");

    }
}
