package NoSolid.ISP;


interface  Fax {
    void typeFax();
}
class LanFax implements Fax {
    public void typeFax() {
        System.out.println("Impresora de marca LanFax");
    }
}
class EFax implements Fax {
    public void typeFax() {
        System.out.println("impresora de marca EFax");
    }
}