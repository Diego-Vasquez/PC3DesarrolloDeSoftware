package NoSolid.ISP;

// import java.util.ArrayList;
// import java.util.List;

class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin ISP");
        Impresora impresora = new ImpresoraAvanzada();
        Fax fax_avanzada = new LanFax();
        impresora.printDocument();
        impresora.sendFax();
        fax_avanzada.typeFax();
        impresora = new ImpresoraBasica();
        Fax fax_basica = new EFax();
        impresora.printDocument();
        fax_basica.typeFax();
        //impresora.sendFax();// Lanza un error
    }
}
