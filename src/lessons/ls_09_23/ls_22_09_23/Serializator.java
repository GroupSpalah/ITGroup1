package lessons.ls_09_23.ls_22_09_23;

import java.io.*;

public class Serializator {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ManSer john = new ManSer(32, "John");

        String fileName = "Man.dat";

       /* try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

//            oos.writeObject(john);

            *//*fos.close();
            oos.close();*//*
        }*/

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        oos.writeObject(john);

        fos.close();
        oos.close();


        /*try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ManSer manSer = (ManSer) ois.readObject();

            System.out.println(manSer);
        }*/

     /*   FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ManSer manSer = (ManSer) ois.readObject();

        System.out.println(manSer);

        fis.close();
        ois.close();*/

//        read();

        Deserializator.read();
    }

    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Man.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ManSer manSer = (ManSer) ois.readObject();

        System.out.println(manSer);

        fis.close();
        ois.close();
    }
}

class ManSer implements Serializable {
    public static final long serialVersionUID = 1L;
    public static int countStatic = 5;
    private int age;
    private String name;
    private transient int counter;

    public ManSer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ManSer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

