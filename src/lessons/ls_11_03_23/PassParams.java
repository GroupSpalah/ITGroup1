package lessons.ls_11_03_23;

public class PassParams {
    public void passInt(int value) {
        value = 10;//change only copy
    }

    public void passObject(ForPassing copy) {
        copy.count = 10;
    }

    public static void passString(String str) {
        str = "Hello";
    }

    public static void main(String[] args) {
        PassParams obj = new PassParams();

        int a = 15;

        obj.passInt(a);//copy of a variable

//        System.out.println(a);

        ForPassing passing = new ForPassing();
        ForPassing passing1 = passing;
        ForPassing passing2 = passing;

        passing.count = 40;

        obj.passObject(passing);//copy of reference passing object

//        System.out.println(passing.count);

        String s = "World";

        passString(s);

        System.out.println(s);
    }

}

class ForPassing {
    public int count;
}


