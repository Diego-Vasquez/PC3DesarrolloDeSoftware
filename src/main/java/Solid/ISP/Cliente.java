package Solid.ISP;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion ISP");
        /*
        Impresora impresora = new ImpresoraBasica();
        impresora.printDocument();
        impresora = new ImpresoraAvanzada();
        impresora.printDocument();
    */
        DispositivoFax fax = new ImpresoraAvanzada();
        fax.sendFax();
        List<Impresora> impresoras = new ArrayList<Impresora>();
        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());
        /*
        for(Impresora dispositivo:impresoras){
            dispositivo.printDocument();
            //dispositivo.sendFax();
        }*/
        impresoras.forEach(Impresora::printDocument);

    }
}
