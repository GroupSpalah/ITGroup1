package lessons.ls_12_23.ls_01_12_23.dao.mysql;

import lessons.ls_12_23.ls_01_12_23.dao.Actionable;
import lessons.ls_12_23.ls_01_12_23.dao.DaoFactory;

public class MySQLDaoFactory extends DaoFactory {
    @Override
    public Actionable getActionable() {
        return new MySQLStudentDAO();
    }
}
