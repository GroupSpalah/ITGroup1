package lessons.ls_12_23.ls_01_12_23.dao.nosql;

import lessons.ls_12_23.ls_01_12_23.dao.Actionable;
import lessons.ls_12_23.ls_01_12_23.dao.Student;

public class NoSQLStudentDAO implements Actionable {
    @Override
    public void save(Student student) {
        System.out.println("Save to Mongo");
    }
}
