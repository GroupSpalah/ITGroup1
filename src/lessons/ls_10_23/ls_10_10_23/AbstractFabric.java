package lessons.ls_10_23.ls_10_10_23;

public class AbstractFabric {
    public static void main(String[] args) {

    }
}

interface Carrots {
    void growth();
}

interface Melon {
    void increase();
}

interface Raspberry {
    void changeColor();
}

class GardenCarrots implements Carrots {
    @Override
    public void growth() {
        System.out.println("Carrots growth");
    }
}

class FieldCarrots implements Carrots {
    @Override
    public void growth() {
        System.out.println("Carrots growth in field");
    }
}

class GardenMelon implements Melon {
    @Override
    public void increase() {
        System.out.println("Melon increase");
    }
}

class FieldMelon implements Melon {
    @Override
    public void increase() {
        System.out.println("Melon increase in field");
    }
}

class GardenRaspberry implements Raspberry {
    @Override
    public void changeColor() {
        System.out.println("Raspberry changes color from green to red");
    }
}

class FieldRaspberry implements Raspberry {
    @Override
    public void changeColor() {
        System.out.println("Raspberry changes color from green to red in field");
    }
}


interface GardenFabric {

    Carrots createCarrots();

    Melon createMelon();

    Raspberry createRaspberry();
}

class RealGarden implements GardenFabric {
    @Override
    public Carrots createCarrots() {
        return new GardenCarrots();
    }

    @Override
    public Melon createMelon() {
        return new GardenMelon();
    }

    @Override
    public Raspberry createRaspberry() {
        return new GardenRaspberry();
    }
}

class FieldGarden implements GardenFabric {
    @Override
    public Carrots createCarrots() {
        return new FieldCarrots();
    }

    @Override
    public Melon createMelon() {
        return new FieldMelon();
    }

    @Override
    public Raspberry createRaspberry() {
        return new FieldRaspberry();
    }
}
