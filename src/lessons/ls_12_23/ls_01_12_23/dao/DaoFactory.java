package lessons.ls_12_23.ls_01_12_23.dao;

import lessons.ls_12_23.ls_01_12_23.dao.mysql.MySQLDaoFactory;
import lessons.ls_12_23.ls_01_12_23.dao.nosql.NoSQLDaoFactory;

public abstract class DaoFactory {

    public abstract Actionable getActionable();

    public static DaoFactory getInstance(int value) {
        return switch (value) {
            case 1 -> new MySQLDaoFactory();
            case 2 -> new NoSQLDaoFactory();
            default -> new NoSQLDaoFactory();
        };
    }

}
