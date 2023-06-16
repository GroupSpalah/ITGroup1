package lessons.ls_01_23.ls_24_01_23;

public class DatatypesAndVariables {
    public static void main(String[] args) {
//        datatype name_variable = value;
        byte a = 10;//8 bits
        short s = 12345;//16 bits
        int i = 123648;//32 bits
        long l = 1234989L;
        byte b1 = a;

        byte b2 = (byte)(a + 5);//15, byte + int -> int(32), downcasting

        int i1 = a;//upcasting

        float f = (float) 12.45;
        float f1 = 12.45f;
        double d = 45.798D;

//        System.out.println("Variable f1 = " + f);

        boolean bool = true;
        boolean bool1 = false;

        char c = 'A';
        char c1 = '\u00A5';

        System.out.println(c1);
    }
}
