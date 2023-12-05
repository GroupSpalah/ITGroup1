package lessons.ls_12_23.ls_05_12_23;

import lessons.ls_12_23.ls_01_12_23.dao.Student;

public interface CrudDAO<T> {
    void save(T t);
    void update(T t);
}
