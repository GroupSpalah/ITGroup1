package lessons.ls_12_23.ls_01_12_23.dao;

public class TestDAO {
    public static void main(String[] args) {
        DaoFactory daoFactory = DaoFactory.getInstance(2);//MySQLDaoFactory

        Actionable actionable = daoFactory.getActionable();//MySQLStudentDAO

        actionable.save(new Student());
    }
}
