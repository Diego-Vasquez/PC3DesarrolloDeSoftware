package NoSolid.ISP;
class ImpresoraBasica implements Impresora {
    @Override
    public void printDocument() {
        System.out.println("La impresora imprime un documento.");
        System.out.println("===================");
    }
    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }
}
