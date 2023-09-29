package lessons.ls_09_23.ls_29_09_23.patterns.structural;

public class AdapterUsb {

}

class Adapter implements MicroUsb {
    private MiniUsb miniUsb;

    public Adapter(MiniUsb miniUsb) {
        this.miniUsb = miniUsb;
    }

    @Override
    public void readMicroUsb() {
        miniUsb.readMiniUsb();
    }

    @Override
    public void writeMicroUsb() {
        miniUsb.wirteMiniUsb();
    }
}

record MiniUsb() {
    public void readMiniUsb() {
        System.out.println("Read mini usb");
    }

    public void wirteMiniUsb() {
        System.out.println("Write mini usb");
    }
}

interface MicroUsb {
    void readMicroUsb();

    void writeMicroUsb();
}
