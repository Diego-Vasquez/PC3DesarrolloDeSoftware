package Solid.ISP;

public class ImpresoraAvanzada implements Impresora, DispositivoFax{
    public void printDocument(){
        System.out.println("Imprimiendo documento de la computadora avanzada");
    }
    public void sendFax(){
        System.out.println("Enviando fax de la impresora avanzada");
    }
}
