package homeworks.anton_gvozdenko.hw_28_03_23;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        String[] EmailParts = email.split("@");

        String[] wordCF = EmailParts[0].split("_");
        String[] wordAP = EmailParts[1].split("\\.");


        char CraigSymbol = wordCF[0].charAt(0);
        char FedSymbol = wordCF[1].charAt(0);

        String SymbolCr = String.valueOf(CraigSymbol);
        String SymbolFd = String.valueOf(FedSymbol);


        String CrSymUp = SymbolCr.toUpperCase();
        String FedSymUp = SymbolFd.toUpperCase();


        String newName = wordCF[0].substring(1);
        String newSurName = wordCF[1].substring(1);

        String nameResult = CrSymUp.concat(newName);
        String surNameResult = FedSymUp.concat(newSurName);

String apple = wordAP[0];
        System.out.println(apple);
        System.out.println(nameResult);
        System.out.println(surNameResult);

    }


}
