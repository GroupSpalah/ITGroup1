package lessons.ls_05_23.ls_26_05_23;

public interface Crud {
    void save();

    void update();

}

interface ForWorkerInt extends Crud {
    float forWorker();

}

class Worker implements ForWorkerInt {
    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public float forWorker() {
        //logic for worker
        return 0;
    }
}

class Student implements Crud {
    @Override
    public void save() {

    }

    @Override
    public void update() {

    }
}


