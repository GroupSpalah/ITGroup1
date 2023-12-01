package lessons.ls_12_23.ls_01_12_23.dao.nosql;

import lessons.ls_12_23.ls_01_12_23.dao.Actionable;
import lessons.ls_12_23.ls_01_12_23.dao.DaoFactory;

public class NoSQLDaoFactory extends DaoFactory {
    @Override
    public Actionable getActionable() {
        return new NoSQLStudentDAO();
    }
}
