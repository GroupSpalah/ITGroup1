package homeworks.anton_gvozdenko.hw_09_05_23.student;

class Contractor extends Student {

    private boolean isPayContract;

    public Contractor(String name, String secondName, String surName, String faculty, int course, int minRating, boolean isPayContract) {
        super(name, secondName, surName, faculty, course, minRating);
        this.isPayContract = isPayContract;
    }

    @Override
    public int transferCourse() {
        if (getMinRating() >= 3 && isPayContract == true) {
            return getCourse() + 1;
        }
        return 0;
    }

    @Override
    public int showStipend() {
        return 0;
    }


    @Override
    public void showInfo() {
        System.out.println("Name = " + getName() + "\tSecond name = " + getSecondName() + "Surname = " + getSurName() + "Faculty = " + getFaculty()
                + "\tCourse = " + getCourse() + "\tRating = " + getMinRating() + "\tSize of stipend = " + showStipend());
    }

}


